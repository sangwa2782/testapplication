package com.ajayam.waycoolapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerCartAdapter extends RecyclerView.Adapter<RecyclerCartAdapter.ViewHolder> {

    Context context;
    ArrayList<CartModel> arrCart;

    RecyclerCartAdapter(Context context, ArrayList<CartModel> arrCart){
       this.context = context;
       this.arrCart = arrCart;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.cart_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cartImg.setImageResource(arrCart.get(position).img);
        holder.cartweight.setText(arrCart.get(position).weight);
        holder.cartName.setText(arrCart.get(position).name);
        holder.cartqty.setText(arrCart.get(position).quantity);
        holder.cartPrice.setText(arrCart.get(position).price);
    }

    @Override
    public int getItemCount() {
        return arrCart.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView cartName,cartweight, cartqty, cartPrice;
        ImageView cartImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cartName = itemView.findViewById(R.id.cartName);
            cartweight = itemView.findViewById(R.id.cartweight);
            cartqty = itemView.findViewById(R.id.cartqty);
            cartPrice = itemView.findViewById(R.id.cartPrice);
            cartImg = itemView.findViewById(R.id.cartImg);

        }
    }

}
