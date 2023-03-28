package com.example.monitoria.Monitoria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Autor {

    @ManyToMany(mappedBy = "autores")
    private List<Livro> livros;
}
