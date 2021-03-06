package com.guiarte.map.guiartemap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * @author santiago
 */

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng costaRica = new LatLng(10, -84);
        LatLng graficaGenesis = new LatLng(9.9279385,-84.0754053);
        LatLng ccPani = new LatLng(9.9261353,-84.0716197);
        LatLng galeriaVidaPlena = new LatLng(9.9322269,-84.0704165);


        mMap.addMarker(new MarkerOptions().position(graficaGenesis).title("Gráfica Génesis"));
        mMap.addMarker(new MarkerOptions().position(ccPani).title("C.C Pani"));
        mMap.addMarker(new MarkerOptions().position(galeriaVidaPlena).title("Galería Vida Plena"));
        mMap.setMyLocationEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(costaRica));

    }
}
