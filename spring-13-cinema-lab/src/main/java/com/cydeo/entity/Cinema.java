package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String sponsoredName;

    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinemaList;

    @ManyToOne
    private Location location;

    public Cinema(String name, String sponsoredName) {
        this.name = name;
        this.sponsoredName = sponsoredName;
    }

}
