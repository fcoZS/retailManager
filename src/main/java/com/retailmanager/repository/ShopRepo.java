package com.retailmanager.repository;

import com.retailmanager.entities.Shop;

import java.util.List;

public interface ShopRepo {
    List<Shop> getShops();
    Shop createShop(Shop shop);
}
