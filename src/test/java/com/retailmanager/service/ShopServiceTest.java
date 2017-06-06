package com.retailmanager.service;

import com.retailmanager.entities.Shop;
import com.retailmanager.repository.ShopRepo;
import com.retailmanager.service.impl.ShopServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ShopServiceTest {
    @InjectMocks
    private ShopServiceImpl shopServiceImpl;

    @Mock
    private ShopRepo shopRepo;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getShops() {
        Shop shop = new Shop();
        shop.setName("testShop");
        List<Shop> shopList = new ArrayList<>();
        shopList.add(shop);
        when(shopRepo.getShops()).thenReturn(shopList);

        List<Shop> shops = shopServiceImpl.getShops();
        assertEquals(1, shops.size());
        assertEquals("testShop", shops.get(0).getName());
    }
}
