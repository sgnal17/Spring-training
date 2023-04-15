package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    private Integer seatNumber;

    private Integer rowNumber;

    @ManyToOne
    private UserAccount userAccount;

    @ManyToOne
    private MovieCinema movieCinema;

    public Ticket(LocalDateTime dateTime, Integer seatNumber, Integer rowNumber) {
        this.dateTime = dateTime;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}
