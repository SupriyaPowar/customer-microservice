package com.classpath.customerservicemicroservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classpath.customerservicemicroservice.entity.Ticket;
import com.classpath.customerservicemicroservice.ticketServiceRepository.TicketServiceRepository;

@Service
public class CustomerTicketService {
	@Autowired
	TicketServiceRepository ticketServiceRepository;

	public void save(Ticket ticket) {
		ticketServiceRepository.save(ticket);

	}

	public Optional<Ticket> getTicket( int id) {
		return ticketServiceRepository.findById(id);
	}

	public List<Ticket> findByCustomerid(int customerid) {

		return ticketServiceRepository.findAll().stream().filter(t -> customerid == t.getCustomerId())
				.collect(Collectors.toList());
	}

}
