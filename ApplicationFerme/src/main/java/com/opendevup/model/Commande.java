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
@Table(name = "commande", schema = "public")
public class Commande implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "numero")
	@NotNull
	private String numero;

	@Column(name = "email")
	@NotNull
	private String email;

	@Column(name = "oeuf")
	@NotNull
	private int nombreOeuf;
	
	@Column(name = "poulet")
	@NotNull
	private int nombrePouletpoulet;
	
	@Column(name = "adresseLivraison")
	@NotNull
	private String adresseLivraison;
	
	@Column(name = "typeCommande")
	@NotNull
	private String typeCommande;
	
	
	public Commande() {
		super();

	}

	public Commande(String numero, String email, int nombreOeuf, int nombrePouletpoulet, String adresseLivraison, String typeCommande) {
		super();
		this.numero = numero;
		this.email = email;
		this.nombreOeuf = nombreOeuf;
		this.nombrePouletpoulet = nombrePouletpoulet;
		this.adresseLivraison = adresseLivraison;
		this.typeCommande = typeCommande;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNombreOeuf() {
		return nombreOeuf;
	}

	public void setNombreOeuf(int nombreOeuf) {
		this.nombreOeuf = nombreOeuf;
	}

	public int getNombrePouletpoulet() {
		return nombrePouletpoulet;
	}

	public void setNombrePouletpoulet(int nombrePouletpoulet) {
		this.nombrePouletpoulet = nombrePouletpoulet;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	public String getTypeCommande() {
		return typeCommande;
	}

	public void setTypeCommande(String typeCommande) {
		this.typeCommande = typeCommande;
	}

	

}
