package com.generation.projeto_final_bloco_02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "O nome é obrigatório!")
    private String nome;

    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("categoria")
    private List<Produto> produto;

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
