package com.dawes.repositorio;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.EmpresaVO;
import com.dawes.modelo.ImpuestosVO;

@Repository
public interface ImpuestosRepository extends CrudRepository<ImpuestosVO, Integer> {

	ImpuestosVO findByBaseimponible(int baseimponible);

	@Transactional
	@Modifying
	public List<ImpuestosVO> findByFechaBetween(LocalDate fechaInicio, LocalDate fechaFin);

	public List<ImpuestosVO> findByDenominacion(EmpresaVO denominacion);
}
