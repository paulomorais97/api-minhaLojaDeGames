package com.games.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="tb_usuario")
public class Usuario {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id_usuario")
	private long id;
	
	@NotNull
	@Column(name="nome_usuario")
	@Size(max =35)
	private String nome;
	
	@NotNull
	@Column(name="email_login")
	@Size(max =99 )
	private String emailLogin;
	
	@NotNull
	@Column(name="senha_usuario")
	@Size(max=8)
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmailLogin() {
		return emailLogin;
	}

	public void setEmailLogin(String emailLogin) {
		this.emailLogin = emailLogin;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
