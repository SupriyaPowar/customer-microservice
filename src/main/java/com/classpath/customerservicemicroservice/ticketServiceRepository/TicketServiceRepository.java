package com.classpath.customerservicemicroservice.ticketServiceRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.classpath.customerservicemicroservice.entity.Ticket;

@Repository
public interface TicketServiceRepository extends JpaRepository<Ticket, Integer> {

}
