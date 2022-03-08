package com.example.lab.gridViewItem;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab.R;

import java.util.List;

public class CountryAdapter extends BaseAdapter {
    private List<Country> listCountries;
    private Context context;
    private LayoutInflater layoutInflater;

    private ImageView flagView;
    private TextView countryNameView;
    private TextView populationView;

    //Truyền frame mainActivity vào biến context
    public CountryAdapter(Context context,  List<Country> listCountries) {
        this.context = context;
        this.listCountries = listCountries;
        layoutInflater = LayoutInflater.from(context);//tạo ra 1 layout con từ frame mainActiviy
    }

    @Override
    public int getCount() {
        return listCountries.size();//Trả về số lượng country -> vd: 5 country
    }

    @Override
    public Object getItem(int position) {
        return listCountries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.gridviewitem_subframe, null); //Khởi tạo frame con có sẵn trong subframe gắn vào convertView
        flagView = (ImageView) convertView.findViewById(R.id.imageView_flag);
        countryNameView = (TextView) convertView.findViewById(R.id.textView_countryName);
        populationView = (TextView) convertView.findViewById(R.id.textView_population);

        Country country = this.listCountries.get(position);
        countryNameView.setText(country.getCountryName());
        populationView.setText("" + country.getPopulation());
        String idImage = country.getFlagName();
        switch (idImage){
            case "us":
                flagView.setImageResource(R.drawable.country_us);
                break;
            case "jp":
                flagView.setImageResource(R.drawable.country_jp);
                break;
            case "vn":
                flagView.setImageResource(R.drawable.country_vn);
                break;
            case "ru":
                flagView.setImageResource(R.drawable.country_ru);
                break;
            case "au":
                flagView.setImageResource(R.drawable.country_au);
                break;
        }
        return convertView;
    }
}
