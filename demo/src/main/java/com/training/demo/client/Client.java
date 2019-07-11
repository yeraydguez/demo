package com.training.demo.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idclients")
    private Integer id;
    
    @NotNull
    @Size(max=100)
    private String name;
    
    @NotNull
    @Size(max=100)
    private String surname1;
    
    @Size(max=100)
    private String surname2;
    
    @NotNull
    @Size(max=100)
    private String dni;
    
    @NotNull
    @Size(max=100)
    private String telephone;
    
    @NotNull
    @Size(max=100)
    private String email;
    
    @NotNull
    @Size(max=100)
    private String bankAccount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname1() {
		return surname1;
	}

	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}

	public String getSurname2() {
		return surname2;
	}

	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", surname1=" + surname1 + "]";
	}

    
}

