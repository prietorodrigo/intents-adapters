package com.example.intentsadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private Button btnNavegador;
    private Button btnMapa;
    private Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        btnNavegador = findViewById(R.id.btnNavegador);
        btnMapa = findViewById(R.id.btnMapa);
        btnCamera = findViewById(R.id.btnCamera);

        btnNavegador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://g1.globo.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:-30.888230744366837, -55.522713236734425"));
                startActivity(intent);
            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
    }
}