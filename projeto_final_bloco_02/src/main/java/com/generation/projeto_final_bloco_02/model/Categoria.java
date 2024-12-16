package com.generation.projeto_final_bloco_02.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String nome;

    private String descricao;

    public long getId() {
        return id;
    }

    public Categoria setId(long id) {
        this.id = id;
        return this;
    }

    public @NotBlank String getNome() {
        return nome;
    }

    public Categoria setNome(@NotBlank String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}