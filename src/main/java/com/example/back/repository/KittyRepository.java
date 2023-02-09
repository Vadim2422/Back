package com.example.back.repository;

import com.example.back.model.KittyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KittyRepository extends JpaRepository<KittyModel, Long> {
}
