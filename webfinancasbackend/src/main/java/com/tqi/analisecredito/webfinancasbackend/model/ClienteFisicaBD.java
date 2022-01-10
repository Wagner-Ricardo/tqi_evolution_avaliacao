package com.tqi.analisecredito.webfinancasbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="client")
public class ClienteFisicaBD {
	private long id;
	private String nome;
	private int cpf;
	private String email;
	private int rg;
	private String data;
	private String hora;
	
	public ClienteFisicaBD() {}

	public ClienteFisicaBD(long id, String nome, int cpf, String email, int rg, String data,String hora) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.rg = rg;
		this.data = data;
		this.hora = hora;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}


	@Column(length = 50,name= "name", nullable = false)
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}


	@Column( length = 20, name= "cpf", nullable = false)
	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	@Column(name= "email", nullable = false)
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	@Column(name= "rg", nullable = false)
	public int getRg() {
		return rg;
	}



	public void setRg(int rg) {
		this.rg = rg;
	}


	@Column(name= "data", nullable = false)
	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}


	@Column(name= "hora", nullable = false)
	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	@Override
	public String toString() {
		return "AnaliseCreditoClienteFisicaBD [idCliente=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email="
				+ email + ", rg=" + rg + ", data=" + data + ", hora=" + hora + "]";
	}
	
	
	
	
	
	
	

}
