package com.alejandro.clevercloudtest.models.entity.dao;

import com.alejandro.clevercloudtest.models.entity.Libro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroDAO extends JpaRepository<Libro,Long> {
    

}
