package com.retailmanager.service;

import com.retailmanager.entities.Shop;

import java.util.List;


public interface ShopService {
    List<Shop> getShops();
    Shop createShop(Shop shop);

}
