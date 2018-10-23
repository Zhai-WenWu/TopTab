package com.example.xiangha.firstrunning;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<String> mList;

    public ItemAdapter(List<String> list) {
        this.mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_item,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tv_item.setText(mList.get(i));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_item;

        public ViewHolder(View view) {
            super(view);
            tv_item = (TextView) view.findViewById(R.id.tv_item);
        }
    }
}
