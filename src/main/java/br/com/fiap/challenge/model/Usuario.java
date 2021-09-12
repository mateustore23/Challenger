package br.com.fiap.challenge.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Usuario {

	@Id
	@SequenceGenerator(name = "usuario", sequenceName = "SQ_T_MW_USUARIO", allocationSize = 1)
	private int usuario;

	private String nome;
	
	private String email;
	
	private String senha;
	
	private String imagem;
	
	@OneToMany
	private List<Gato> gatos;
	
	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the imagem
	 */
	public String getImagem() {
		return imagem;
	}

	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	/**
	 * @return the gatos
	 */
	public List<Gato> getGatos() {
		return gatos;
	}

	/**
	 * @param gatos the gatos to set
	 */
	public void setGatos(List<Gato> gatos) {
		this.gatos = gatos;
	}
}
