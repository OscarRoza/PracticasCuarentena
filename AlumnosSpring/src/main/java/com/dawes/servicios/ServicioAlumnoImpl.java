package com.dawes.servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.AlumnoVO;
import com.dawes.repositorios.AlumnoRepository;

@Service
public class ServicioAlumnoImpl   {

	@Autowired
	AlumnoRepository AR;

	public AlumnoVO findByNombre(String nombre) {
		return AR.findByNombre(nombre);
	}

	public List<AlumnoVO> findAllByCursosFechaBetween(LocalDate inicio, LocalDate fin) {
		return AR.findAllByCursosFechaBetween(inicio, fin);
	}

	public <S extends AlumnoVO> S save(S entity) {
		return AR.save(entity);
	}

	public <S extends AlumnoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return AR.saveAll(entities);
	}

	public Optional<AlumnoVO> findById(Integer id) {
		return AR.findById(id);
	}

	public boolean existsById(Integer id) {
		return AR.existsById(id);
	}

	public Iterable<AlumnoVO> findAll() {
		return AR.findAll();
	}

	public Iterable<AlumnoVO> findAllById(Iterable<Integer> ids) {
		return AR.findAllById(ids);
	}

	public long count() {
		return AR.count();
	}

	public void deleteById(Integer id) {
		AR.deleteById(id);
	}

	public void delete(AlumnoVO entity) {
		AR.delete(entity);
	}

	public void deleteAll(Iterable<? extends AlumnoVO> entities) {
		AR.deleteAll(entities);
	}

	public void deleteAll() {
		AR.deleteAll();
	}

	

}
