package com.retailmanager.endpoints;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ShopEndpointTest {

    @InjectMocks
    private ShopEndpoint shopEndpoint;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createShop() {

    }

}
