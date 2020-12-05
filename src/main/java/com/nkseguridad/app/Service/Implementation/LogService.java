package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Log;
import com.nkseguridad.app.Repository.ILogRepository;
import com.nkseguridad.app.Service.ILogService;

@Service
public class LogService implements ILogService {

	@Autowired
	private ILogRepository LogRepository;
	
	@Override
	public List<Log> findAll() {
		// TODO Auto-generated method stub
		return (List<Log>)LogRepository.findAll();
	}

	@Override
	public Log save(Log log) {
		// TODO Auto-generated method stub
		return LogRepository.save(log);
	}

}
