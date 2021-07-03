package com.kripton.recycleview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NewsAdapterClass extends RecyclerView.Adapter<NewsAdapterClass.ViewHolder>{
    List<NewsModelClass> list;
    Activity activity;

    public NewsAdapterClass(List<NewsModelClass> list, Activity activity) {
        this.list = list;
        this.activity = activity;
    }

    @NonNull
    @NotNull
    @Override
    public NewsAdapterClass.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull NewsAdapterClass.ViewHolder holder, int position) {
        String title = list.get(position).getNewsTitle();
        String time = list.get(position).getNewsTime();
        String desc = list.get(position).getNewsDesp();
        String imageurl = list.get(position).getImageURL();
        holder.setData(activity,title,desc,time,imageurl);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView newsimage;
        TextView title,desc,time;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            newsimage = itemView.findViewById(R.id.newsimage);
            title = itemView.findViewById(R.id.newstitle);
            desc = itemView.findViewById(R.id.newsdesp);
            time = itemView.findViewById(R.id.newstime);
        }
        void setData(Activity act,String... str)
        {
            title.setText(str[0]);
            desc.setText(str[1]);
            time.setText(str[2]);
            Glide.with(act).load(str[3])
                    .into(newsimage);
        }
    }
}
