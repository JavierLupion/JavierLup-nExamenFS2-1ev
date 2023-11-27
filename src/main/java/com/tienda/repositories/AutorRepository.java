package com.tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tienda.persistance.entities.AutorEntity;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Long>{

}