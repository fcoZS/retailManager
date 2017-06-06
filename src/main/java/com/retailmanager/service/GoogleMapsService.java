package com.retailmanager.service;


import com.google.maps.NearbySearchRequest;
import com.retailmanager.entities.Address;

public interface GoogleMapsService {
    NearbySearchRequest searchByLocation(double latitude, double longitude);
    void getLocationByAddress(Address address);
}
