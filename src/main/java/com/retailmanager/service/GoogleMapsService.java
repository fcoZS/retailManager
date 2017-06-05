package com.retailmanager.service;


import com.google.maps.NearbySearchRequest;
import com.google.maps.model.LatLng;

public interface GoogleMapsService {
    NearbySearchRequest searchByLocation(double latitude, double longitude);
}
