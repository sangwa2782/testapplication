package com.ajayam.p21database_connectivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyDBHelper extends SQLiteOpenHelper {

    private  static final String DATABASE_NAME = "ContactsDB";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_CONTACT = "contacts";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE_NO = "phone_no";



    private static final String CREATE_TABLE_LOG = "CREATE TABLE " + TABLE_CONTACT + " ( " +
            KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            KEY_NAME + " TEXT, " +
            KEY_PHONE_NO + " TEXT " +
            " ) ";


//        db.execSQL("CREATE TABLE " + TABLE_CONTACT +
//            " ( " + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + "TEXT NOT NULL, " + KEY_PHONE_NO + "TEXT NOT NULL " + " ) " );
//


    private SQLiteDatabase database;


    public MyDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        // CREATE TABLE contacts (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phone_no TEXT);




//        db.execSQL("CREATE TABLE " + TABLE_CONTACT +
//                " ( " + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + "TEXT NOT NULL, " + KEY_PHONE_NO + "TEXT NOT NULL " + " ) " );

//        database = this.getWritableDatabase();

//        database.close();
        db.execSQL(CREATE_TABLE_LOG);
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_CONTACT);

        onCreate(db);
    }

     public void addContact(String name, String phone_no){
         database = this.getWritableDatabase();

         ContentValues values = new ContentValues();
         values.put(KEY_NAME, name);
         values.put(KEY_PHONE_NO, phone_no);

        database.insert(TABLE_CONTACT, null, values);

         database.close();
     }

     public ArrayList<ContactModel> fetchContext(){

         database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery("SELECT * FROM " + TABLE_CONTACT, null);

        ArrayList<ContactModel> arrContacts = new ArrayList<>();

        while (cursor.moveToNext()){

            ContactModel model = new ContactModel();
            model.id = cursor.getInt(0);
            model.name = cursor.getString(1);
            model.phone_no = cursor.getString(2);

            arrContacts.add(model);

        }

        return arrContacts;

     }

     public void updateContact(ContactModel contactModel){
        database = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(KEY_PHONE_NO, contactModel.phone_no);

        database.update(TABLE_CONTACT, cv, KEY_ID+" = "+ contactModel.id, null);
     }

     public void DeleteContact(int id){

        database = this.getWritableDatabase();

        database.delete(TABLE_CONTACT, KEY_ID+ " = ? ", new String[]{String.valueOf(id)});


     }
}
