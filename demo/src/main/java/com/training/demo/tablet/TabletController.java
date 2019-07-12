package com.training.demo.tablet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.tablet.TabletRepository;
import com.training.demo.tablet.Tablet;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TabletController {

	@Autowired 
	private TabletRepository tabletRepository;
	
    @GetMapping("/tablets")
    public Iterable<Tablet> getAllEstablishments() {
        return tabletRepository.findAll();
    }

    @GetMapping("/tablets/{id}")
    Tablet getTabletById(@PathVariable int id) {
        return tabletRepository.findById(id).get();
    }

}
