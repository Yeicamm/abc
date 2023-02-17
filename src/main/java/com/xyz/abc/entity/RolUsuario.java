package com.xyz.abc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Table(name = "RolUsuario")
@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RolUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="rol")
    private Rol rol;

    @OneToOne
    @JoinColumn(name="usuario")
    private Usuario usuario;


}
