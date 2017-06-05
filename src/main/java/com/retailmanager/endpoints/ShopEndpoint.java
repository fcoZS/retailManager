package com.retailmanager.endpoints;

import com.google.maps.NearbySearchRequest;
import com.retailmanager.entities.Shop;
import com.retailmanager.service.GoogleMapsService;
import com.retailmanager.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ShopEndpoint {

    @Autowired
    private ShopService shopService;

    @Autowired
    private GoogleMapsService googleMapsService;

    @RequestMapping(method = RequestMethod.GET, value = "shops")
    public List<Shop> getShops() {
        return shopService.getShops();
    }

    @RequestMapping(method = RequestMethod.POST, value = "shops")
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.createShop(shop);
    }

    @RequestMapping(method = RequestMethod.GET, value = "shop/{latitude}/{longitude}")
    public void getShopByLocation(@PathVariable double latitude, @PathVariable double longitude) {
        googleMapsService.searchByLocation(latitude, longitude);
    }
}
