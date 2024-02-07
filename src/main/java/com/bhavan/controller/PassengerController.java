package com.bhavan.controller;

import com.bhavan.binding.Passenger;
import com.bhavan.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("ticketDetails",passengerService.getAllTicket());

        return "index";

    }

    @GetMapping("/bookTicket")
    public String bookPassengerTicket(Model model){

        model.addAttribute("ticketDetails",new Passenger());

        return "bookTicket";

    }

    @PostMapping(value = "/bookTicket")
    public String bookTicket(@ModelAttribute ("ticketDetails") Passenger passenger , Model model){

        passengerService.bookTicket(passenger);

        model.addAttribute("message","Ticket Booked Successfully");

        return "bookTicket";

    }



}
