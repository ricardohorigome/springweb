package br.com.youtube.angularjs.contato;

import java.util.Date;

public class Contato {
	
	private String nome;
	private String telefone;
	private Date data;
	private Operadora operadora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Operadora getOperadora() {
		return operadora;
	}
	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	} 
	
	
	
	

}
