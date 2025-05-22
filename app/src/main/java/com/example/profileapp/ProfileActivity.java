package com.example.profileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    ImageView backButton, editProfile;
    LinearLayout supportBtn, credGarageCard, referEarnCard, allTransactionsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        backButton = findViewById(R.id.back_button);
        editProfile = findViewById(R.id.edit_profile);
        supportBtn = findViewById(R.id.supportBtn);
        credGarageCard = findViewById(R.id.credGarageCard);
        referEarnCard = findViewById(R.id.referEarnCard);
        allTransactionsCard = findViewById(R.id.allTransactionsCard);

        backButton.setOnClickListener(v -> finish());

        editProfile.setOnClickListener(v ->
                Toast.makeText(ProfileActivity.this, "Edit Profile clicked", Toast.LENGTH_SHORT).show()
        );

        supportBtn.setOnClickListener(v ->
                        Toast.makeText(ProfileActivity.this, "Support clicked", Toast.LENGTH_SHORT).show()
        );

        credGarageCard.setOnClickListener(v ->
                Toast.makeText(ProfileActivity.this, "CRED Garage clicked", Toast.LENGTH_SHORT).show()
        );

        referEarnCard.setOnClickListener(v ->
                Toast.makeText(ProfileActivity.this, "Refer & Earn clicked", Toast.LENGTH_SHORT).show()
        );

        allTransactionsCard.setOnClickListener(v ->
                Toast.makeText(ProfileActivity.this, "All Transactions clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
