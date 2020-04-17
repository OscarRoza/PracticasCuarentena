package com.dawes.repositorio;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.EmpresaVO;
import com.dawes.modelo.ImpuestosVO;

@Repository
public interface ImpuestosRepository extends CrudRepository<ImpuestosVO, Integer> {

	ImpuestosVO findByBaseimponible(int baseimponible);

	public List<ImpuestosVO> findByFechaBetween(Date fecha1, Date fecha2);

	public List<ImpuestosVO> findByDenominacion(EmpresaVO denominacion);
}
