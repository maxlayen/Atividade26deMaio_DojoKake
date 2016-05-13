package br.unifor.cct.cc.logica.pratica;

/*
 * Q01 - Construa um registro de Candidato, contendo os seguintes campos: 
 * 
  - codigo de inscricao,
  - nome do candidato
  - semestre do candidato
  - curso do candidato 
  - email 
  - telefone
  - tem whatsapp. 
 */

public class Candidato {

	private int codigoInscricao;
	private String nomeCandidato;
	private int semestreCurso;
	private String curso;
	private String email;
	private String telefone;
	private boolean hasWhatsapp;

	// Getters - Métodos get são usados para obter um valor 
	// Setters - Métodos set são usados para definir um valor
	
	public int getCodigoInscricao(){
		return codigoInscricao;
	}
	
	public void setCodigoInscricao(int codigoInscricao){
		this.codigoInscricao = codigoInscricao;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public int getSemestreCurso() {
		return semestreCurso;
	}

	public void setSemestreCurso(int semestreCurso) {
		this.semestreCurso = semestreCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean hasWhatsapp() {
		return hasWhatsapp;
	}

	public void setHasWhatsapp(boolean hasWhatsapp) {
		this.hasWhatsapp = hasWhatsapp;
	}
	
}
