package com.example.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class    Adapter extends RecyclerView.Adapter<Adapter.Myclass> {

    MainActivity mainActivity;
    String[] title;
    Integer[] img;
    String[] URL;

    public Adapter(MainActivity mainActivity, String[] title, Integer[] img, String[] URL) {

        this.img = img;
        this.title = title;
        this.mainActivity = mainActivity;
        this.URL = URL;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item_file , parent,false);
        return new Myclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myclass holder, int position) {

        holder.textView.setText(title[position]);
        holder.imageView.setBackgroundResource(img[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( mainActivity , WebActivity.class);
                intent.putExtra("url", mainActivity.URL[position].toString());
                intent.putExtra("pageHeading", mainActivity.title[position].toString());
                Toast.makeText(mainActivity, mainActivity.URL[position].toString(), Toast.LENGTH_SHORT).show();
                mainActivity.startActivity(intent);
            }
        });
    }

    // REMOVE old onBindViewHolder Function
/*    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }
*/
    @Override
    public int getItemCount() {
        return img.length;
    }




    // Make a Class which extens RecyclerView.ViewHoler and ENABLE constructor Super matching
    class Myclass extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public Myclass(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.adapterImg);
            textView = itemView.findViewById(R.id.adaptertxt);

        }

    }

}
