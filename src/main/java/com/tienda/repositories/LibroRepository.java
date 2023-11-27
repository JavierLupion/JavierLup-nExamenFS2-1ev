package com.tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tienda.persistance.entities.LibroEntity;


@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Long> {

}