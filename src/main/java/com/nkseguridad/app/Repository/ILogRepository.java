package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Log;

@Repository
public interface ILogRepository extends CrudRepository<Log, Long>{

}
