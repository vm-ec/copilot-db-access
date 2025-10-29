package com.example.demo.repository;

import com.example.demo.data.PdProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PdProductRepository extends JpaRepository<PdProduct, Long> {
}
