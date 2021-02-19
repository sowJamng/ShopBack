package org.sid.catservice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Produit implements Serializable{
public Produit(Long id, String designation, int quantite, double price) {
		super();
		this.id = id;
		this.designation = designation;
		this.quantite = quantite;
		this.price = price;
	}
public String toString() {
return "designation:"+this.designation+"quantite:"+this.quantite+"prix"+this.price;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String designation;
private int quantite;
private double price;
}
