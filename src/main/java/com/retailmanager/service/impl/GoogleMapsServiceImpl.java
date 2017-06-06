package com.retailmanager.service.impl;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.NearbySearchRequest;
import com.google.maps.PlacesApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.retailmanager.entities.Address;
import com.retailmanager.service.GoogleMapsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GoogleMapsServiceImpl implements GoogleMapsService{

    @Value("${gmaps.key}")
    private String key;
    private static GeoApiContext context;

    public GoogleMapsServiceImpl() {
        this.context = new GeoApiContext().setApiKey(this.key);
    }

    public void getLocationByAddress(Address address) {
        try {
            GeocodingResult[] results =  GeocodingApi.geocode(context, address.getPostCode()).await();
            System.out.println(results.toString());
            System.out.println(results[0].formattedAddress);
        } catch (Exception e) {

        }
       // return GeocodingApi.geocode(context, address.getPostCode());
    }

    public NearbySearchRequest searchByLocation(double latitude, double longitude) {
        LatLng latLng = new LatLng(latitude, longitude);
        return PlacesApi.nearbySearchQuery(context, latLng);
    }
}
