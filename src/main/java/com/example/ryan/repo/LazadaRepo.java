package com.example.ryan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ryan.lazada.LazadaEntity;

@Repository
public interface LazadaRepo extends JpaRepository<LazadaEntity, Long>{

}
