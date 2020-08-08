package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, String> {

}
