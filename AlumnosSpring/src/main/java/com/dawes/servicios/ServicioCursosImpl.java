package com.dawes.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.CursosVO;
import com.dawes.repositorios.CursosRepository;

@Service
public class ServicioCursosImpl implements ServicioCursos {

	@Autowired
	CursosRepository CR;

	@Override
	public CursosVO findBynombreCurso(String nombreCurso) {
		return CR.findBynombreCurso(nombreCurso);
	}

	@Override
	public <S extends CursosVO> S save(S entity) {
		return CR.save(entity);
	}

	@Override
	public <S extends CursosVO> Iterable<S> saveAll(Iterable<S> entities) {
		return CR.saveAll(entities);
	}

	@Override
	public Optional<CursosVO> findById(Integer id) {
		return CR.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return CR.existsById(id);
	}

	@Override
	public Iterable<CursosVO> findAll() {
		return CR.findAll();
	}

	@Override
	public Iterable<CursosVO> findAllById(Iterable<Integer> ids) {
		return CR.findAllById(ids);
	}

	@Override
	public long count() {
		return CR.count();
	}

	@Override
	public void deleteById(Integer id) {
		CR.deleteById(id);
	}

	@Override
	public void delete(CursosVO entity) {
		CR.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends CursosVO> entities) {
		CR.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		CR.deleteAll();
	}

}
