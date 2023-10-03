package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button zomboid, zomboid2,zomboid3,zomboid4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        zomboid=findViewById(R.id.zomboid);
    }
    public void pantalla_zomboid(View view)
    {
        Intent i=new Intent(this, MainActivity3.class);
        startActivity(i);
    }
    public void west_point(View view)
    {
        Intent e=new Intent(this, MainActivity4.class);
        startActivity(e);
    }

    public void raven_creek(View view)
    {
        Intent e=new Intent(this, MainActivity5.class);
        startActivity(e);
    }
    public void wood(View view)
    {
        Intent e=new Intent(this, MainActivity6.class);
        startActivity(e);
    }

}
