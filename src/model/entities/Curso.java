package model.entities;

import java.util.Objects;

public class Curso {

	private Integer idcurso;
	private String nomeCurso;

	public Curso() {
	}
	
	public Curso(Integer idcurso, String nomeCurso) {
		this.idcurso = idcurso;
		this.nomeCurso = nomeCurso;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	@Override
	public String toString() {
		return "Curso [idcurso=" + idcurso + ", nomeCurso=" + nomeCurso + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nomeCurso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(nomeCurso, other.nomeCurso);
	}
	
	
}