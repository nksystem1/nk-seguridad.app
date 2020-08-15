package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Unidadmedida;

@Repository
public interface IUnidadMedidaRepository extends CrudRepository<Unidadmedida, String> {

}
