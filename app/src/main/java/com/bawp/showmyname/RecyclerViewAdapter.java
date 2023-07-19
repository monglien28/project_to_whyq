package com.bawp.showmyname;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final Context context;
    private final List<Ordering> orderList;


    public RecyclerViewAdapter(Context context , List<Ordering> orderList) {

        this.context = context;
        this.orderList = orderList;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.order, parent , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Ordering ordering = orderList.get(position);
        holder.order.setText(ordering.getOrders());

    }

    @Override
    public int getItemCount() {

        return orderList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView order;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.order = itemView.findViewById(R.id.order_number);

        }


    }
}