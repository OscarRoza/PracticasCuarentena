package com.dawes.servicios;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.EmpresaVO;
import com.dawes.modelo.ImpuestosVO;
import com.dawes.repositorio.ImpuestosRepository;

@Service
public class ServicioImpuestosImpl {

	@Autowired
	ImpuestosRepository IR;

	public ImpuestosVO findByBaseimponible(int baseimponible) {
		return IR.findByBaseimponible(baseimponible);
	}



	public List<ImpuestosVO> findByFechaBetween(LocalDate fechaInicio, LocalDate fechaFin) {
		return IR.findByFechaBetween(fechaInicio, fechaFin);
	}



	public List<ImpuestosVO> findByDenominacion(EmpresaVO denominacion) {
		return IR.findByDenominacion(denominacion);
	}

	public <S extends ImpuestosVO> S save(S entity) {
		return IR.save(entity);
	}

	public <S extends ImpuestosVO> Iterable<S> saveAll(Iterable<S> entities) {
		return IR.saveAll(entities);
	}

	public Optional<ImpuestosVO> findById(Integer id) {
		return IR.findById(id);
	}

	public boolean existsById(Integer id) {
		return IR.existsById(id);
	}

	public Iterable<ImpuestosVO> findAll() {
		return IR.findAll();
	}

	public Iterable<ImpuestosVO> findAllById(Iterable<Integer> ids) {
		return IR.findAllById(ids);
	}

	public long count() {
		return IR.count();
	}

	public void deleteById(Integer id) {
		IR.deleteById(id);
	}

	public void delete(ImpuestosVO entity) {
		IR.delete(entity);
	}

	public void deleteAll(Iterable<? extends ImpuestosVO> entities) {
		IR.deleteAll(entities);
	}

	public void deleteAll() {
		IR.deleteAll();
	}

}
