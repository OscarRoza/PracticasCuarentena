package com.dawes.servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.dawes.modelo.AlumnoVO;

public interface ServicioAlumno {

	AlumnoVO findByNombre(String nombre);

	List<AlumnoVO> findAllByCursosFechaBetween(LocalDate inicio, LocalDate fin);

	<S extends AlumnoVO> S save(S entity);

	<S extends AlumnoVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<AlumnoVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<AlumnoVO> findAll();

	Iterable<AlumnoVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(AlumnoVO entity);

	void deleteAll(Iterable<? extends AlumnoVO> entities);

	void deleteAll();

}