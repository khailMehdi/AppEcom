package com.example.billingservice.Repository;

import entitie.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<Long, ProductItem> {
}
