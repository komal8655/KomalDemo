package com.example.komaldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Googlemap extends FragmentActivity implements OnMapReadyCallback {
GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googlemap);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this::onMapReady);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;
        LatLng Maharashtra = new LatLng(19.169527, 73.341601);
        map.addMarker(new MarkerOptions().position(Maharashtra).title("Maharashtra"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Maharashtra));
    }

    private void addMarker(MarkerOptions maharashtra) {
    }

    private void moveCamera(CameraUpdate newLatLng) {
    }
}