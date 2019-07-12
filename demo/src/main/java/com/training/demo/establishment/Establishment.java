package com.training.demo.establishment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.training.demo.client.Client;
import com.training.demo.tablet.Tablet;


@Entity
@Table(name="establishments")
public class Establishment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idestablishments")
    private Integer id;
    
    @NotNull
    @Size(max=100)
    private String name;
    
    @NotNull
    @Size(max=100)
    private String address;
    
    @NotNull
    @Size(max=100)
    private String city;
    
    @NotNull
    @Size(max=100)
    private String telephone1;

    @Size(max=100)
    private String telephone2;
    
    @OneToOne
	@JoinColumn(name = "tablets_idtablets")
	private Tablet tablet;
    
    @ManyToOne
	@JoinColumn(name = "clients_idclients")
	private Client client;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public Tablet getTablet() {
		return tablet;
	}

	public void setTablet(Tablet tablet) {
		this.tablet = tablet;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
            
}

