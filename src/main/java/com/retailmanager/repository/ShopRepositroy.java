package com.retailmanager.repository;

import com.retailmanager.entities.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepositroy extends CrudRepository<Shop,Long> {
}
