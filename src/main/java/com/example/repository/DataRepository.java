package com.example.repository;

import com.example.entity.CreateData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<String, CreateData> {
}
