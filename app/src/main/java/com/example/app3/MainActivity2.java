package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnOpenYouTube = findViewById(R.id.btnOpenYouTube);
        Button btnOpenFacebook = findViewById(R.id.btnOpenFacebook);

        btnOpenYouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String youtubeChannelUrl = "https://www.youtube.com/watch?v=eoJEn7MDht0&list=RDUIg8t122Fso&index=2";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeChannelUrl));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    String youtubeWebUrl = "https://www.youtube.com/user/CanalDeEjemplo";
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeWebUrl));
                    startActivity(webIntent);
                }
            }
        });

        btnOpenFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFacebookPage("https://www.facebook.com/InventarioOculto");
            }
        });
    }

    private void openFacebookPage(String username) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String facebookUrl = getFacebookPageURL(username);
        intent.setData(Uri.parse(facebookUrl));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            intent.setData(Uri.parse("https://www.facebook.com/" + username));
            startActivity(intent);
        }
    }

    private String getFacebookPageURL(String username) {
        return "https://www.facebook.com/" + username;
    }
}
