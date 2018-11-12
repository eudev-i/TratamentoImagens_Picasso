package br.com.senaijandira.tratamentoimagens_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    /*DECLARAR O IMAGE VIEW*/
    ImageView imageView;

    /*CAMINHO NO LOCALHOST*/
    String urlImagem = "http://10.0.2.2/INF3M20182/TURMA_A/VITORIA/imagensAndroid/sapoIgnora.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*FIND VIEW DO ID DA IMAGE VIEW*/
        imageView = findViewById(R.id.imageView);

        /*CARREGAR IMAGEM DA INTER WEB*/
        Picasso.get().load(urlImagem).into(imageView);
    }
}
