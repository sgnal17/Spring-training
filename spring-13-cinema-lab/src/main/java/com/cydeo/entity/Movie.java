package com.cydeo.entity;


import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime releaseDate;

    private Integer duration;

    private String summary;

    @ManyToMany
    @JoinTable(name="MovieGenreRel"
    ,joinColumns = @JoinColumn(name="movie_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList;

    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movieCinemaList;

    public Movie(String name, BigDecimal price, Type type, State state, LocalDateTime releaseDate, Integer duration, String summary) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.state = state;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
