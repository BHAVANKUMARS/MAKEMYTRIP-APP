package com.bhavan.service;

import com.bhavan.binding.Passenger;
import com.bhavan.binding.Ticket;

import java.util.Collection;
import java.util.List;

public interface PassengerService {

    Ticket bookTicket(Passenger passenger);

    List<Ticket> getAllTicket();

}
