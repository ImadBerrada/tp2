package com.example.demo.repository;

import com.example.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

    Produit findByQuantite(int i);

}
