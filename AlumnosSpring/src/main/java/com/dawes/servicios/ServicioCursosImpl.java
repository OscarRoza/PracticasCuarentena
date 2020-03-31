package com.dawes.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.CursosVO;
import com.dawes.repositorios.CursosRepository;

@Service
public class ServicioCursosImpl   {
	@Autowired
	CursosRepository CR;

	public CursosVO findByNombrecurso(String nombreCurso) {
		return CR.findByNombrecurso(nombreCurso);
	}

	public <S extends CursosVO> S save(S entity) {
		return CR.save(entity);
	}

	public <S extends CursosVO> Iterable<S> saveAll(Iterable<S> entities) {
		return CR.saveAll(entities);
	}

	public Optional<CursosVO> findById(Integer id) {
		return CR.findById(id);
	}

	public boolean existsById(Integer id) {
		return CR.existsById(id);
	}

	public Iterable<CursosVO> findAll() {
		return CR.findAll();
	}

	public Iterable<CursosVO> findAllById(Iterable<Integer> ids) {
		return CR.findAllById(ids);
	}

	public long count() {
		return CR.count();
	}

	public void deleteById(Integer id) {
		CR.deleteById(id);
	}

	public void delete(CursosVO entity) {
		CR.delete(entity);
	}

	public void deleteAll(Iterable<? extends CursosVO> entities) {
		CR.deleteAll(entities);
	}

	public void deleteAll() {
		CR.deleteAll();
	}

}
