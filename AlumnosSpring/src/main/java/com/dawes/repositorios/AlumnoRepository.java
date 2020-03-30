package com.dawes.repositorios;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.dawes.modelo.AlumnoVO;

@Repository
public interface AlumnoRepository extends CrudRepository<AlumnoVO, Integer> {

	AlumnoVO findByNombre(String nombre);
	
	List<AlumnoVO> findAllByCursosFechaBetween(LocalDate inicio, LocalDate fin);

}
