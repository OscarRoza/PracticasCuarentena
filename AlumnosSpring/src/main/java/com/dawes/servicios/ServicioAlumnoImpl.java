package com.dawes.servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dawes.modelo.AlumnoVO;
import com.dawes.repositorios.AlumnoRepository;

@Service
public class ServicioAlumnoImpl implements ServicioAlumno {

	
	AlumnoRepository AR;

	@Override
	public AlumnoVO findByNombre(String nombre) {
		return AR.findByNombre(nombre);
	}

	@Override
	public List<AlumnoVO> findAllByCursosFechaBetween(LocalDate inicio, LocalDate fin) {
		return AR.findAllByCursosFechaBetween(inicio, fin);
	}

	@Override
	public <S extends AlumnoVO> S save(S entity) {
		return AR.save(entity);
	}

	@Override
	public <S extends AlumnoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return AR.saveAll(entities);
	}

	@Override
	public Optional<AlumnoVO> findById(Integer id) {
		return AR.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return AR.existsById(id);
	}

	@Override
	public Iterable<AlumnoVO> findAll() {
		return AR.findAll();
	}

	@Override
	public Iterable<AlumnoVO> findAllById(Iterable<Integer> ids) {
		return AR.findAllById(ids);
	}

	@Override
	public long count() {
		return AR.count();
	}

	@Override
	public void deleteById(Integer id) {
		AR.deleteById(id);
	}

	@Override
	public void delete(AlumnoVO entity) {
		AR.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends AlumnoVO> entities) {
		AR.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		AR.deleteAll();
	}
	

}
