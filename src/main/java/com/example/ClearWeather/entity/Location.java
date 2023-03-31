package com.example.ClearWeather.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "country")
    String country;

    @Column(name = "city")
    String city;

    @OneToMany(mappedBy = "location")
    Set<Temperature> temperatures = new HashSet<>();
}
