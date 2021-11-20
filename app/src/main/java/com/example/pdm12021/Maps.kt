package com.example.pdm12021


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

internal class Maps : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val cor = LatLng(28.607851, -106.128386)
        mMap.addMarker(MarkerOptions()
            .position(cor)

            .title("Marker in ULSA"))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(cor))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cor, 18.0f))

        mMap.addMarker(MarkerOptions()
            .position(cor)
            .position(LatLng(28.62250221029112, -106.1149211335203))
            .title("Marker in Plaza del Sol"))



    }

}


