package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.nkseguridad.app.Entity.Marca;

@Repository
public interface IMarcaRepository extends CrudRepository<Marca, Long> {

}
