package com.example.relicktcgapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InicioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageView botonIniciar = findViewById(R.id.imageView5);

        botonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(InicioActivity.this, TutorialActivity.class);
                startActivity(intent);
                finish(); // Opcional: cerrar esta pantalla para no volver atrás
            }
        });
    }
}
