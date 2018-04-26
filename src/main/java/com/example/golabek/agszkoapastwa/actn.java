package com.example.golabek.agszkoapastwa;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class actn extends AppCompatActivity implements OnMapReadyCallback {

    public MapView mapView;
    public static final String MAP_VIEW_BUNDLE_KEY = "test";
    private Button bshowMap;
    private EditText ETsetCountry;
    public LatLng countryLatLng;
    public Bundle mapViewBundle = null;
    public String country;
    public String capitol ;
    public double lat;
    public double lng;
    public double people;
    public Context x;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actn);


        Bundle bundle = getIntent().getExtras();

        country = bundle.getString("Country");
        capitol = bundle.getString("Capitol");
        lat = bundle.getDouble("Lat");
        lng = bundle.getDouble("Lng");
        people = bundle.getDouble("People");


        if (savedInstanceState !=null) {

            mapViewBundle = savedInstanceState.getBundle(MAP_VIEW_BUNDLE_KEY);
        }



        countryLatLng = new LatLng(lat, lng);


        mapView = findViewById(R.id.countrymaps);
        mapView.onCreate(mapViewBundle);
        mapView.getMapAsync(this);

        bshowMap = findViewById(R.id.bsm);
        ETsetCountry = findViewById(R.id.country);


        x = getApplicationContext();

        bshowMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent Factivity = new Intent(x,main.class);
                startActivity(Factivity);


            }
        });


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Bundle mapViewBundle = outState.getBundle(MAP_VIEW_BUNDLE_KEY);

        if(mapViewBundle==null) {

            mapViewBundle = new Bundle();
            outState.putBundle(MAP_VIEW_BUNDLE_KEY,mapViewBundle);
        }

        mapView.onSaveInstanceState(mapViewBundle);
    }


    @Override
    protected void onResume() {

        super.onResume();
        mapView.onResume();

    }

    @Override
    protected void onStart() {

        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop() {

        super.onStop();
        mapView.onStop();
    }



    @Override
    public void onMapReady(GoogleMap map) {

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(countryLatLng,1));
        map.addMarker(new MarkerOptions()
                        .title("Państwo: "+country+", Stolica: "+ capitol)
                        .snippet("Liczba ludności: "+people+" mln")
                        .position(countryLatLng));

  //      map.setMyLocationEnabled(true);



    }


    @Override
    protected void onPause() {

        super.onPause();
        mapView.onPause();
    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
        mapView.onDestroy();

    }


    @Override
    public void onLowMemory() {

        super.onLowMemory();
        mapView.onLowMemory();

    }




}
