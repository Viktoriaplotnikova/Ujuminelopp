package com.example.opilane.ujumine;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ujumine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ujumine=(Button) findViewById(R.id.Link);
        //see tegevus võimaldab sul nuppule vajutamisel avada veebileht
        ujumine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String url="https://et.wikipedia.org/wiki/Ujumine_(spordiala)";

                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
}
    public void Pildid(View view) {
        Intent intent= new Intent(MainActivity.this,pildid.class );
        startActivity(intent);
    }
}
