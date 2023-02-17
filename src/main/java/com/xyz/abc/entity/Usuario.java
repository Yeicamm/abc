package com.xyz.abc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table (name = "Usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "documento", nullable = false, unique = true)
    private int documento;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "usuario", nullable = false, unique = true)
    private String usuario;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "correo", nullable = false, unique = true)
    private String correo;
    @Column(name = "estado", nullable = false)
    private boolean estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Cargo> idCargo;

}
