package com.example.billingservice.Repository;

import entitie.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Long , Bill> {
}
