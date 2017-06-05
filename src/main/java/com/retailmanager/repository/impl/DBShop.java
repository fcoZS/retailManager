package com.retailmanager.repository.impl;

import com.retailmanager.entities.Shop;
import com.retailmanager.repository.ShopRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DBShop implements ShopRepo {
    private static Map<String, Shop> shops = new HashMap<String, Shop>();

    static {
        Shop a = new Shop();
        a.setName("Simor Diera");
        shops.put(a.getName(), a);
        Shop b = new Shop();
        b.setName("Susan Jota");
        shops.put(b.getName(), b);
        Shop c = new Shop();
        c.setName("Lola Mento");
        shops.put(c.getName(), c);
    }

    public List<Shop> getShops() {
        return new ArrayList<Shop>(shops.values());
    }

    public Shop createShop(Shop shop) {
        shops.put(shop.getName(), shop);
        return shops.get(shop.getName());
    }
}
