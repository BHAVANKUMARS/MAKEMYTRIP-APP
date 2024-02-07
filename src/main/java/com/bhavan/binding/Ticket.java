package com.bhavan.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {

    private int ticketNumber;

    private String name;

    private String email;

    private String doj;

    private String from;

    private String to;

    private String trainNum;

    private String status;

}
