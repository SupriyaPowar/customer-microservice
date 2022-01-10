package com.classpath.customerservicemicroservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classpath.customerservicemicroservice.entity.Ticket;
import com.classpath.customerservicemicroservice.service.CustomerTicketService;

@RestController
@RequestMapping("/api")
public class CustomerserviceController {
	@Autowired
	CustomerTicketService customerTicketService;

	@PostMapping("/ticket/customer/{customerid}")
	public Ticket createTicket(@RequestBody Ticket ticket, @PathVariable int customerid) {
		ticket.setCustomerId(customerid);
		customerTicketService.save(ticket);
		return ticket;

	}

	@GetMapping("/ticket/customer/{customerid}")
	public List<Ticket> getTicket(@PathVariable int customerid) {
		return customerTicketService.findByCustomerid(customerid);

	}

	@GetMapping("/ticket/customer/{customerid}/ticket/{id}")
	public Optional<Ticket> getTicket(@PathVariable("customerid") int customerid, @PathVariable("id") int id) {
		return customerTicketService.getTicket(id);
	}

}