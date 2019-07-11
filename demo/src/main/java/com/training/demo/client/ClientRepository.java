package com.training.demo.client;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.demo.client.Client;


public interface ClientRepository extends JpaRepository<Client, Integer> {

}
