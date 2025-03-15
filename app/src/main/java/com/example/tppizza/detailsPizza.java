package com.example.tppizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tppizza.beans.Produit;
import com.example.tppizza.service.ProduitService;

public class detailsPizza extends AppCompatActivity {
    private ProduitService ps;
    private ImageView photo;
    private TextView nom;
    private TextView description;
    private TextView ingredients;
    private TextView preparation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);

        // Initialize views
        photo = findViewById(R.id.imagePlat);
        nom = findViewById(R.id.nom);
        description = findViewById(R.id.description);
        ingredients = findViewById(R.id.ingredients);
        preparation = findViewById(R.id.preparation);

        // Get the id from the Intent
        Intent intent = getIntent();
        int pizzaId = intent.getIntExtra("pizzaId", -1); // -1 is a default value in case the key is not found

        // Retrieve the product by id
        ps = ProduitService.getInstance();
        Produit p = ps.findById(pizzaId);

        // Check if the product exists
        if (p != null) {
            photo.setImageResource(p.getPhoto());
            nom.setText(p.getNom());
            ingredients.setText(p.getDetailsIngred());
            description.setText(p.getDescription());
            preparation.setText(p.getPreparation());
        } else {
            // Handle the case where the product is not found
            Toast.makeText(this, "Produit introuvable", Toast.LENGTH_SHORT).show();
            finish(); // Close the activity if product is not found
        }
    }
}