package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainrecyclerView;

    Integer img[] = {
            R.drawable.whatsapp,
            R.drawable.facebook,
            R.drawable.github,
            R.drawable.google,
            R.drawable.linkedin,
            R.drawable.reddit,
            R.drawable.snapchat,
            R.drawable.twitter,
            R.drawable.instagram,
            R.drawable.quora
    };

    String title[] = {
            "whatsapp",
            "Facebook",
            "Github",
            "Google",
            "LinkedIn",
            "Reddit",
            "Snapchat",
            "twitter",
            "instagram",
            "Quora"
    };


    String URL[]= {
            "https://whatsapp.com/",
            "https://facebook.com/",
            "https://github.com/",
            "https://google.com/",
            "https://linkedin.com/",
            "https://reddit.com/",
            "https://snapchat.com/",
            "https://twitter.com/",
            "https://instagram.com/",
            "https://quora.com/",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainrecyclerView = findViewById(R.id.mainrecyclerView);
        mainrecyclerView.setLayoutManager(new LinearLayoutManager(this ));

        Adapter adapter = new Adapter(MainActivity.this, title,img,URL);
        mainrecyclerView.setAdapter(adapter);

    }
}