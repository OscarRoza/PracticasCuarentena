package com.dawes.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.CursosVO;

@Repository
public interface CursosRepository extends CrudRepository<CursosVO, Integer> {
	public CursosVO findByNombrecurso(String nombreCurso);

}
