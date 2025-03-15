package com.example.tppizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tppizza.beans.Produit;
import com.example.tppizza.service.ProduitService;

public class DetailsProduit extends AppCompatActivity {

    private ProduitService fs;
    private ImageView photo;
    private TextView nom;
    private TextView nbrIngredients;
    private TextView duree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details_produit);


            Intent intent = getIntent();
            int id = Integer.parseInt(intent.getStringExtra("idf"));
            fs = ProduitService.getInstance();
            photo = findViewById(R.id.imagePlat);
            nom = findViewById(R.id.nom);
            nbrIngredients = findViewById(R.id.nbrIngredients);
            duree = findViewById(R.id.duree);

            Produit f = fs.findById(id);
            photo.setImageResource(f.getPhoto());
            nom.setText(f.getNom());
            nbrIngredients.setText(f.getNbrIngredients());
            duree.setText(f.getDuree());


    }
}

//un syglaotor