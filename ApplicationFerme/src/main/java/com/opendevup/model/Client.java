package com.opendevup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "utilisateur", schema = "public")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "nom")
	@NotNull
	private String nom;

	@Column(name = "email")
	@NotNull
	private String email;

	@Column(name = "motdepasse")
	@NotNull
	private String motdepasse;
	
	@Column(name = "adresse")
	@NotNull
	private String adresse;
	
	
	private String role;
	
	
	public Client() {
		super();
		
		this.role = "USER";

	}

	public Client(String nom, String email, String motdepasse, String adresse) {
		super();
		this.nom = nom;
		this.email = email;
		this.motdepasse = motdepasse;
		this.adresse = adresse;
		this.role = "USER";

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
