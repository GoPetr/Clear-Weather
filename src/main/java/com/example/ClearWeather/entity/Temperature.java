package com.example.ClearWeather.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "temperature")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "temperature")
    Integer temperature;

    @Column(name = "time_temperature")
    ZonedDateTime timeTemperature;

    @ManyToOne
    @JoinColumn(name = "location_id")
    Location location;
}
