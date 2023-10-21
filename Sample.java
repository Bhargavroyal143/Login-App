package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Sample username and password
    private static final String CORRECT_USERNAME = "user";
    private static final String CORRECT_PASSWORD = "password";

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        // Set click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get user input from EditText fields
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Check if username and password are correct
                if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                    // Display a success message
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                } else {
                    // Display an error message
                    Toast.makeText(MainActivity.this, "Invalid username or password. Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
