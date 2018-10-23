package alvaro.stucom.com.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Accion para que el boton nos lleve a la clase Play
        Button button_play = findViewById(R.id.button_play);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Play.class);
                startActivity(intent);
            }
        });

        //Accion para que el boton nos lleve a la clase Rank
        Button button_rank = findViewById(R.id.button_rank);
        button_rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Rank.class);
                startActivity(intent);
            }
        });

        //Accion para que el boton nos lleve a la clase Settings
        Button button_settings = findViewById(R.id.button_settings);
        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
            }
        });

        //Accion para que el boton nos lleve a la clase About
        Button button_About = findViewById(R.id.button_about);
        button_About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });



    }

}
