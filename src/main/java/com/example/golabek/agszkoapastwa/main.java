package com.example.golabek.agszkoapastwa;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;

public class main extends AppCompatActivity implements OnMapReadyCallback {

    public MapView mapView;
    public static final String MAP_VIEW_BUNDLE_KEY = "test";
    private Button bshowMap;
    private EditText ETsetCountry;
    public LatLng countryLatLng;
    public Bundle mapViewBundle = null;
    public Context x;


   public Map<String, Integer> CountryName = new HashMap<>();
   public Map<Integer, String> CountryCapitol = new HashMap<>();
   public Map<Integer, Double> CapitolLat = new HashMap<>();
   public Map<Integer, Double> CapitolLng = new HashMap<>();
   public Map<Integer, Double> CountryPeopleNumber = new HashMap<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountryName.put("POLSKA",1);
        CountryCapitol.put(1,"Warszawa");
        CapitolLat.put(1,52.229676);
        CapitolLng.put(1,21.0122289);
        CountryPeopleNumber.put(1,37.95);

        CountryName.put("NIEMCY",2);
        CountryCapitol.put(2,"Berlin");
        CapitolLat.put(2,52.52006);
        CapitolLng.put(2,13.4049);
        CountryPeopleNumber.put(2,82.67);

        CountryName.put("FRANCJA",3);
        CountryCapitol.put(3,"Paryż");
        CapitolLat.put(3,48.85);
        CapitolLng.put(3,2.35222);
        CountryPeopleNumber.put(3,66.9);

        CountryName.put("AFGANISTAN",4);
        CountryCapitol.put(4,"Kabul");
        CapitolLat.put(4,34.555);
        CapitolLng.put(4,69.207);
        CountryPeopleNumber.put(4,34.66);

        CountryName.put("ALBANIA",5);
        CountryCapitol.put(5,"Tirana");
        CapitolLat.put(5,41.327);
        CapitolLng.put(5,19.818);
        CountryPeopleNumber.put(5,2.876);

        CountryName.put("ALGERIA",6);
        CountryCapitol.put(6,"Algier");
        CapitolLat.put(6,36.754);
        CapitolLng.put(6,3.069);
        CountryPeopleNumber.put(6,40.61);

        CountryName.put("ANDORA",7);
        CountryCapitol.put(7,"Andora");
        CapitolLat.put(7,42.506);
        CapitolLng.put(7,1.522);
        CountryPeopleNumber.put(7,0.077);

        CountryName.put("ANGOLA",8);
        CountryCapitol.put(8,"Luanda");
        CapitolLat.put(8,-8.839);
        CapitolLng.put(8,13.289);
        CountryPeopleNumber.put(8,53.01);

        CountryName.put("ANTIGUA I BARBUDA",9);
        CountryCapitol.put(9,"Saint John's");
        CapitolLat.put(9,17.127);
        CapitolLng.put(9,-61.847);
        CountryPeopleNumber.put(9,0.101);

        CountryName.put("ARABIA SAUDYJSKA",10);
        CountryCapitol.put(10,"Rijad");
        CapitolLat.put(10,24.713);
        CapitolLng.put(10,46.675);
        CountryPeopleNumber.put(10,28.101);

        CountryName.put("ARGENTYNA",11);
        CountryCapitol.put(11,"Buenos Aires");
        CapitolLat.put(11,-34.603);
        CapitolLng.put(11,-58.381);
        CountryPeopleNumber.put(11,43.85);

        CountryName.put("ARMENIA",12);
        CountryCapitol.put(12,"Erywań");
        CapitolLat.put(12,40.1791857);
        CapitolLng.put(12,44.499);
        CountryPeopleNumber.put(12,2.925);

        CountryName.put("AUSTRALIA",13);
        CountryCapitol.put(13,"Canberra");
        CapitolLat.put(13,-35.2809);
        CapitolLng.put(13,149.130);
        CountryPeopleNumber.put(13,24.13);

        CountryName.put("AUSTRIA",14);
        CountryCapitol.put(14,"Wiedeń");
        CapitolLat.put(14,48.208);
        CapitolLng.put(14,16.374);
        CountryPeopleNumber.put(14,8.747);

        CountryName.put("AZERBEJDŻAN",15);
        CountryCapitol.put(15,"Baku");
        CapitolLat.put(15,40.409);
        CapitolLng.put(15,49.867);
        CountryPeopleNumber.put(15,9.762);

        CountryName.put("BAHAMY",16);
        CountryCapitol.put(16,"Nassau");
        CapitolLat.put(16,25.048);
        CapitolLng.put(16,-77.355);
        CountryPeopleNumber.put(16,0.391);

        CountryName.put("BAHRAJN",17);
        CountryCapitol.put(17,"Manama");
        CapitolLat.put(17,26.2285);
        CapitolLng.put(17,50.586);
        CountryPeopleNumber.put(17,1.425);

        CountryName.put("BANGLADESZ",18);
        CountryCapitol.put(18,"Dhaka");
        CapitolLat.put(18,23.810);
        CapitolLng.put(18,90.4125);
        CountryPeopleNumber.put(18,163.0);

        CountryName.put("BARBADOS",19);
        CountryCapitol.put(19,"Bridgetown");
        CapitolLat.put(19,13.0968511);
        CapitolLng.put(19,-59.614);
        CountryPeopleNumber.put(19,0.285);

        CountryName.put("BELGIA",20);
        CountryCapitol.put(20,"Bruksela");
        CapitolLat.put(20,50.850);
        CapitolLng.put(20,4.352);
        CountryPeopleNumber.put(20,11.35);

        CountryName.put("ROSJA",21);
        CountryCapitol.put(21,"Moskwa");
        CapitolLat.put(21,55.756);
        CapitolLng.put(21,37.617);
        CountryPeopleNumber.put(21,144.3);

        CountryName.put("CHORWACJA",22);
        CountryCapitol.put(22,"Zagrzeb");
        CapitolLat.put(22,45.815);
        CapitolLng.put(22,15.982);
        CountryPeopleNumber.put(22,4.171);

        CountryName.put("CZECHY",23);
        CountryCapitol.put(23,"Praga");
        CapitolLat.put(23,50.0755);
        CapitolLng.put(23,14.4378);
        CountryPeopleNumber.put(23,10.56);

        CountryName.put("BRAZYLIA",24);
        CountryCapitol.put(24,"Brasilia");
        CapitolLat.put(24,-15.794);
        CapitolLng.put(24,-47.882);
        CountryPeopleNumber.put(24,207.7);

        CountryName.put("CHINY",25);
        CountryCapitol.put(25,"Pekin");
        CapitolLat.put(25,39.904);
        CapitolLng.put(25,116.407);
        CountryPeopleNumber.put(25,1379.0);

        CountryName.put("GRECJA",26);
        CountryCapitol.put(26,"Ateny");
        CapitolLat.put(26,37.984);
        CapitolLng.put(26,23.727);
        CountryPeopleNumber.put(26,10.75);

        CountryName.put("WŁOCHY",27);
        CountryCapitol.put(27,"Rzym");
        CapitolLat.put(27,41.903);
        CapitolLng.put(27,12.496);
        CountryPeopleNumber.put(27,60.6);

        CountryName.put("KANADA",28);
        CountryCapitol.put(28,"Ottawa");
        CapitolLat.put(28,45.421);
        CapitolLng.put(28,-75.697);
        CountryPeopleNumber.put(28,36.29);

        CountryName.put("SŁOWACJA",29);
        CountryCapitol.put(29,"Bratysława");
        CapitolLat.put(29,48.148);
        CapitolLng.put(29,17.108);
        CountryPeopleNumber.put(29,5.429);

        CountryName.put("STANY ZJEDNOCZONE",30);
        CountryCapitol.put(30,"Waszyngton");
        CapitolLat.put(30,47.751);
        CapitolLng.put(30,-120.740);
        CountryPeopleNumber.put(30,325.7);

        CountryName.put("BELIZE",31);
        CountryCapitol.put(31,"Belmopan");
        CapitolLat.put(31,17.251);
        CapitolLng.put(31,-88.759);
        CountryPeopleNumber.put(31,0.367);

        CountryName.put("HISZPANIA",32);
        CountryCapitol.put(32,"Madryt");
        CapitolLat.put(32,40.4167);
        CapitolLng.put(32,-3.7037);
        CountryPeopleNumber.put(32,46.56);

        CountryName.put("WIELKA BRYTANIA",33);
        CountryCapitol.put(33,"Londyn");
        CapitolLat.put(33,51.507);
        CapitolLng.put(33,-0.128);
        CountryPeopleNumber.put(33,65.64);

        CountryName.put("INDIE",34);
        CountryCapitol.put(34,"Nowe Delhi");
        CapitolLat.put(34,28.614);
        CapitolLng.put(34,77.209);
        CountryPeopleNumber.put(34,1324.0);

        CountryName.put("SZWECJA",35);
        CountryCapitol.put(35,"Sztokholm");
        CapitolLat.put(35,59.329);
        CapitolLng.put(35,18.068);
        CountryPeopleNumber.put(35,1324.0);




        if (savedInstanceState !=null) {

            mapViewBundle = savedInstanceState.getBundle(MAP_VIEW_BUNDLE_KEY);
        }



              countryLatLng = new LatLng(52.229676, 21.0122289);


        mapView = findViewById(R.id.countrymaps);
        mapView.onCreate(mapViewBundle);
        mapView.getMapAsync(this);

        bshowMap = findViewById(R.id.bsm);
        ETsetCountry = findViewById(R.id.country);


        x = getApplicationContext();

        bshowMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String countrySet = ETsetCountry.getText().toString();

                if(CountryName.containsKey(countrySet.toUpperCase()))
                {


                    int CountryIndex = CountryName.get(countrySet.toUpperCase());

                    String CapitolCity = CountryCapitol.get(CountryIndex);
                    double Clat = CapitolLat.get(CountryIndex);
                    double Clng = CapitolLng.get(CountryIndex);
                    double PeopleN = CountryPeopleNumber.get(CountryIndex);


                 //   ETsetCountry.setText(CapitolCity+" "+Clat+" "+Clng+" "+PeopleN);

                    Intent Sactivity = new Intent(x,actn.class);

                    Sactivity.putExtra("Country",countrySet);
                    Sactivity.putExtra("Capitol",CapitolCity);
                    Sactivity.putExtra("Lat",Clat);
                    Sactivity.putExtra("Lng",Clng);
                    Sactivity.putExtra("People",PeopleN);



                    startActivity(Sactivity);


                }

                else {

                    Toast.makeText(getApplicationContext(),"Nie ma takiego Panstwa",Toast.LENGTH_LONG).show();

                }





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
                        .title("Państwo: POLSKA, Stolica: Warszawa")
                        .snippet("Liczb ludności: 37.95 mln")
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
