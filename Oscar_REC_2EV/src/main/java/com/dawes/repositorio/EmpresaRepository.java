package com.dawes.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.EmpresaVO;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaVO, Integer> {

	EmpresaVO findByDenominacion(String denominacion);
}
