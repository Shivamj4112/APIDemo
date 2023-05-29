package com.jobs.apidemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class DataListAdapter extends RecyclerView.Adapter<DataListAdapter.DataListHolder> {
    List<ResultsItem> results;
    public DataListAdapter(List<ResultsItem> results) {
        this.results = results;
    }

    @NonNull
    @Override
    public DataListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DataListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DataListHolder holder, int position) {
        holder.viewPager.setAdapter(new ImagePager(results.get(position).getImages()));
        holder.textView.setText(results.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    class DataListHolder extends RecyclerView.ViewHolder {
        ViewPager viewPager;
        TextView textView;
        public DataListHolder(@NonNull View itemView) {
            super(itemView);

            viewPager = itemView.findViewById(R.id.images);
            textView = itemView.findViewById(R.id.name);

        }
    }




}
