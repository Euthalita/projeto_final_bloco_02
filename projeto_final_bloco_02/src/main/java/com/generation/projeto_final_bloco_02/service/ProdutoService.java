package com.generation.projeto_final_bloco_02.service;

import com.generation.projeto_final_bloco_02.model.Categoria;
import com.generation.projeto_final_bloco_02.model.Produto;
import com.generation.projeto_final_bloco_02.repository.CategoriaRepository;
import com.generation.projeto_final_bloco_02.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;


    public Produto obterProduto(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (produto.isPresent()) {
            return produto.get();
        } else {
            throw new RuntimeException("Produto não encontrado com id: " + id);
        }
    }
    
    public Double calcularDesconto(Produto produto) {
        if (produto.getDesconto() != null) {
            return calcularDescontoPorProduto(produto);
        }
        if (produto.getCategoria() != null && produto.getCategoria().getDescontoPadrao() != null) {
            return calcularDescontoPorCategoria(produto);
        }
        
        return produto.getValor();
    }
    
    private Double calcularDescontoPorProduto(Produto produto) {
        double descontoValor = produto.getDesconto() / 100;
        return produto.getValor() - (produto.getValor() * descontoValor);
    }
    
    private Double calcularDescontoPorCategoria(Produto produto) {
        Categoria categoria = produto.getCategoria();
        double descontoValor = categoria.getDescontoPadrao() / 100;
        return produto.getValor() - (produto.getValor() * descontoValor);
    }


}
