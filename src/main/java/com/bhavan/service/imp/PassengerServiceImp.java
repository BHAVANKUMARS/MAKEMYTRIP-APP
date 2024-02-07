package com.bhavan.service.imp;

import com.bhavan.binding.Passenger;
import com.bhavan.binding.Ticket;
import com.bhavan.service.PassengerService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class PassengerServiceImp implements PassengerService {

    private static final String IRCTC_URL = "http://localhost:9090/";

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Ticket bookTicket(Passenger passenger) {

        ResponseEntity<Ticket> response = restTemplate.postForEntity( IRCTC_URL + "bookTicket" , passenger , Ticket.class );

        return response.getBody();

    }

    @Override
    public List<Ticket> getAllTicket() {

        ResponseEntity<Ticket[]> response = restTemplate.getForEntity( IRCTC_URL + "getAllTickets" , Ticket[].class );

        return Arrays.asList(response.getBody());

    }
}
