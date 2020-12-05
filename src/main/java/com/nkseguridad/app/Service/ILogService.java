package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Log;

public interface ILogService {
	
	public List<Log> findAll();
	public Log save(Log log);

}
