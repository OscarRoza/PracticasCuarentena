package com.dawes.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class CursosVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcurso;
	private String nombrecurso;
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
	private List<AlumnoCursoVO> alumnos;

	public CursosVO() {
		super();
	}

	public CursosVO(int idcurso, String nombrecurso, List<AlumnoCursoVO> alumnos) {
		super();
		this.idcurso = idcurso;
		this.nombrecurso = nombrecurso;
		this.alumnos = alumnos;
	}

	public CursosVO(String nombrecurso, List<AlumnoCursoVO> alumnos) {
		super();
		this.nombrecurso = nombrecurso;
		this.alumnos = alumnos;
	}

	public int getidcurso() {
		return idcurso;
	}

	public void setidcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public String getnombrecurso() {
		return nombrecurso;
	}

	public void setnombrecurso(String nombrecurso) {
		this.nombrecurso = nombrecurso;
	}

	public List<AlumnoCursoVO> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoCursoVO> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumnos == null) ? 0 : alumnos.hashCode());
		result = prime * result + idcurso;
		result = prime * result + ((nombrecurso == null) ? 0 : nombrecurso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursosVO other = (CursosVO) obj;
		if (alumnos == null) {
			if (other.alumnos != null)
				return false;
		} else if (!alumnos.equals(other.alumnos))
			return false;
		if (idcurso != other.idcurso)
			return false;
		if (nombrecurso == null) {
			if (other.nombrecurso != null)
				return false;
		} else if (!nombrecurso.equals(other.nombrecurso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CursosVO [idcurso=" + idcurso + ", nombrecurso=" + nombrecurso + ", alumnos=" + alumnos + "]";
	}

}
