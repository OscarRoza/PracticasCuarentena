package com.dawes.repositorio;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.ImpuestosVO;

@Repository
public interface ImpuestosRepository extends CrudRepository<ImpuestosVO, Integer> {

	ImpuestosVO findByBaseimponible(int baseimponible);
	

}
