package com.Bootcamp.Bootcamp.student;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder //design pattern qui simplifie la creation de projet
@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue//valeur generer
    private Integer id;
    private String firstname;
    private String lasttname;
    private LocalDate dateOfBirth;




}
