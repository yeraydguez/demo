package com.training.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.client.ClientRepository;
import com.training.demo.client.Client;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ClientController {

	@Autowired 
	private ClientRepository clientRepository;
	
    @GetMapping("/clients")
    public Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    Client getClientById(@PathVariable int id) {
        return clientRepository.findById(id).get();
    }

}
