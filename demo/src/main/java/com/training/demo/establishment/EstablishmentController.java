package com.training.demo.establishment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.establishment.EstablishmentRepository;
import com.training.demo.establishment.Establishment;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EstablishmentController {

	@Autowired 
	private EstablishmentRepository establishmentRepository;
	
    @GetMapping("/establishments")
    public Iterable<Establishment> getAllEstablishments() {
        return establishmentRepository.findAll();
    }

    @GetMapping("/establishments/{id}")
    Establishment getEstablishmentById(@PathVariable int id) {
        return establishmentRepository.findById(id).get();
    }

}
