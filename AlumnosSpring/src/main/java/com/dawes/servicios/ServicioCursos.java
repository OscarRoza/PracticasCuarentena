package com.dawes.servicios;

import java.util.Optional;

import com.dawes.modelo.CursosVO;

public interface ServicioCursos {

	CursosVO findBynombreCurso(String nombreCurso);

	<S extends CursosVO> S save(S entity);

	<S extends CursosVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<CursosVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<CursosVO> findAll();

	Iterable<CursosVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(CursosVO entity);

	void deleteAll(Iterable<? extends CursosVO> entities);

	void deleteAll();

}