package com.example.monitoria.Monitoria.model;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // @OneToOne(mappedBy = "endereco")
    private Aluno aluno;
}
