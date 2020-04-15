package com.dawes.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.EmpresaVO;
import com.dawes.repositorio.EmpresaRepository;

@Service
public class ServicioEmpresaImpl {

	@Autowired
	EmpresaRepository ER;

	public EmpresaVO findByDenominacion(String denominacion) {
		return ER.findByDenominacion(denominacion);
	}

	public <S extends EmpresaVO> S save(S entity) {
		return ER.save(entity);
	}

	public <S extends EmpresaVO> Iterable<S> saveAll(Iterable<S> entities) {
		return ER.saveAll(entities);
	}

	public Optional<EmpresaVO> findById(Integer id) {
		return ER.findById(id);
	}

	public boolean existsById(Integer id) {
		return ER.existsById(id);
	}

	public Iterable<EmpresaVO> findAll() {
		return ER.findAll();
	}

	public Iterable<EmpresaVO> findAllById(Iterable<Integer> ids) {
		return ER.findAllById(ids);
	}

	public long count() {
		return ER.count();
	}

	public void deleteById(Integer id) {
		ER.deleteById(id);
	}

	public void delete(EmpresaVO entity) {
		ER.delete(entity);
	}

	public void deleteAll(Iterable<? extends EmpresaVO> entities) {
		ER.deleteAll(entities);
	}

	public void deleteAll() {
		ER.deleteAll();
	}

}
