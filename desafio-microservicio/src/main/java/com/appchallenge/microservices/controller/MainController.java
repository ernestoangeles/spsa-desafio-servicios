package com.appchallenge.microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class MainController {
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public void addCustomer() {		
		
	}

	@RequestMapping(value="/list-kpi", method = RequestMethod.GET)
	public String listKpi() {		
		return "getCustomerKpi";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String  list() {		
		return "getCustomerList";
	}	

	/*
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Integer id){
        //customerService.deleteCustomer(id);
        return new ResponseEntity("Cliente borrado satisfactoriamente.", HttpStatus.OK);
    }
    */
}
