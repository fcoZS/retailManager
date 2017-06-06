package com.retailmanager.service.impl;


import com.retailmanager.entities.Shop;
import com.retailmanager.repository.ShopRepo;
import com.retailmanager.service.GoogleMapsService;
import com.retailmanager.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepo shopRepo;

    @Autowired
    private GoogleMapsService googleMapsService;

    public ShopServiceImpl() {
    }

    public List<Shop> getShops() {
        return shopRepo.getShops();
    }

    public Shop createShop(Shop shop) {
        googleMapsService.getLocationByAddress(shop.getAddress());
        return  shopRepo.createShop(shop);
    }
}
