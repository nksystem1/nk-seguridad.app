package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Vendedor;

@Repository
public interface IVendedorRepository extends CrudRepository<Vendedor, String> {

}
