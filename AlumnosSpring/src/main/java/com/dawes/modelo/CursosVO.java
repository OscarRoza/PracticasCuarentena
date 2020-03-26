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
	private int idCurso;
	private String nombreCurso;
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
	private List<AlumnoCursoVO> alumnos;

	public CursosVO() {
		super();
	}

	public CursosVO(int idCurso, String nombreCurso, List<AlumnoCursoVO> alumnos) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.alumnos = alumnos;
	}

	public CursosVO(String nombreCurso, List<AlumnoCursoVO> alumnos) {
		super();
		this.nombreCurso = nombreCurso;
		this.alumnos = alumnos;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
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
		result = prime * result + idCurso;
		result = prime * result + ((nombreCurso == null) ? 0 : nombreCurso.hashCode());
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
		if (idCurso != other.idCurso)
			return false;
		if (nombreCurso == null) {
			if (other.nombreCurso != null)
				return false;
		} else if (!nombreCurso.equals(other.nombreCurso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CursosVO [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", alumnos=" + alumnos + "]";
	}

}
