package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Negocio;
import com.nkseguridad.app.Repository.INegocioRepository;
import com.nkseguridad.app.Service.INegocioService;

@Service
public class NegocioService implements INegocioService {

	@Autowired
	private INegocioRepository NegocioRepository;
	@Override
	public List<Negocio> findAll() {
		// TODO Auto-generated method stub
		return (List<Negocio>)NegocioRepository.findAll();
	}
	@Override
	public Negocio findByCodigo(String codnegocio) {
		// TODO Auto-generated method stub
		return NegocioRepository.findById(codnegocio).orElse(null);
	}
	@Override
	public Negocio save(Negocio negocio) {
		// TODO Auto-generated method stub
		return NegocioRepository.save(negocio);
	}
	@Override
	public boolean findByExisteCodigo(Negocio negocio) {
		// TODO Auto-generated method stub
		return NegocioRepository.existsById(negocio.getCodnegocio());
	}
	@Override
	public Negocio updaNegocio(Negocio negocio) {
		// TODO Auto-generated method stub
		return NegocioRepository.save(negocio);
	}

}
