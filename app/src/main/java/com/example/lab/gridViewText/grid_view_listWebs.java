package com.example.lab.gridViewText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.lab.R;

public class grid_view_listWebs extends AppCompatActivity {

    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_list_webs);

        this.gridView = (GridView) findViewById(R.id.gridView);

        Web o7planning = new Web("o7planning","http://o7planning.org");
        Web google = new Web("Google","http://google.com");
        Web facebook = new Web("Facebook","http://facebook.com");
        Web eclipse = new Web("Eclipse","http://eclipse.org");
        Web yahoo = new Web("Yahoo","http://yahoo.com");

        Web[] webs = new Web[]{o7planning, google, facebook, eclipse, yahoo};

        //Tạo ra 1 cầu nối adapter truyền vào adapter 1 mảng và cái view để lát adapter nối
        ArrayAdapter<Web> arrayAdapter
                = new ArrayAdapter<Web>(this, android.R.layout.simple_list_item_1, webs);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                Web website = (Web) o;
                Toast.makeText(grid_view_listWebs.this, "Selected :" + " " + website.getName()+"\n("+ website.getUrl()+")",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}