package com.rendi.fragmentviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityHome extends AppCompatActivity {
public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button = findViewById(R.id.btnMove);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenFragmentCheckout();
            }
        });

    }
    public void OpenFragmentCheckout(){
        Intent intent = new Intent(this, Fragment_ShoesCheckout.class);
        startActivity(intent);
    }
}
