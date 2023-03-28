package com.example.monitoria.Monitoria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Livro {

    @ManyToMany
    private List<Autor> autores;
}
