package com.retailmanager.endpoints;

import com.retailmanager.entities.Shop;
import com.retailmanager.service.ShopService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.List;

public class ShopEndpointTest {

    @InjectMocks
    private ShopEndpoint shopEndpoint;

    @Mock
    private ShopService shopService;

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
        when(shopService.getShops()).thenReturn(shopList);

        List<Shop> shops = shopEndpoint.getShops();
        assertEquals(1, shops.size());
        assertEquals("testShop", shops.get(0).getName());
    }

}
