package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Vendedor;

public interface IVendedorService {

	public List<Vendedor> findAll();
	public Vendedor findByCodigo(String codigo);
	public Vendedor save(Vendedor vendedor);
	public Vendedor updaVendedor(Vendedor vendedor);
	public boolean findByExisteCodigo(String codigo);
}
