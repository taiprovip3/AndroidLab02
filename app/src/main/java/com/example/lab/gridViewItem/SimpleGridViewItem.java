package com.example.lab.gridViewItem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.lab.R;

import java.util.ArrayList;
import java.util.List;

public class SimpleGridViewItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridviewitem_main_activity);

        Country vietnam = new Country("Vietnam", "vn", 98000000);
        Country usa = new Country("United States", "us", 320000000);
        Country russia = new Country("Russia", "ru", 142000000);
        Country australia = new Country("Australia", "au", 23766305);
        Country japan = new Country("Japan", "jp", 126788677);
        List<Country> listCountries = new ArrayList<Country>();
        listCountries.add(vietnam);
        listCountries.add(usa);
        listCountries.add(russia);
        listCountries.add(australia);
        listCountries.add(japan);

        final GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new CountryAdapter(this, listCountries));

        // When the user clicks on the GridItem
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(SimpleGridViewItem.this, "Selected :"
                        + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }
}