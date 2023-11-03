package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="persona",schema="public")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    @Column(name="nombre", columnDefinition = "VARCHAR(255) DEFAULT ''")
    private String nombre;

    @Column(name="edad", columnDefinition = "INTEGER DEFAULT '0'")
    private Integer edad;
}
