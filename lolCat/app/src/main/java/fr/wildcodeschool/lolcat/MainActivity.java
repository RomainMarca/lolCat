package fr.wildcodeschool.lolcat;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MediaPlayer meow = MediaPlayer.create(this, R.raw.meow);
        final MediaPlayer ronron = MediaPlayer.create(this, R.raw.ronron);
        TextView touchMe = findViewById(R.id.text_touch_me);
        final TextView hahaha = findViewById(R.id.text_haha);
        ImageView cat = findViewById(R.id.imgcat);


        ronron.start();

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ronron.stop();
                meow.start();

                hahaha.setVisibility(View.VISIBLE);


            }
        });







    }
}
