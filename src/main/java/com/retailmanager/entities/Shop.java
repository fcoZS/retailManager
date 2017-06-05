package com.retailmanager.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Shop {
    @JsonProperty("shopName")
    private String name;

    @JsonProperty("shopAddress")
    private Address address;

    private double latitude;
    private double longitude;
}
