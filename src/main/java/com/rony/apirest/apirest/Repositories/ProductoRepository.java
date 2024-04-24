package com.rony.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rony.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
