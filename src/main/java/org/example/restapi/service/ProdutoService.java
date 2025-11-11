package org.example.restapi.service;

import org.example.restapi.entity.Produto;
import org.example.restapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtosRepository;

    public ProdutoService(ProdutoRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    public void criar(Produto produtos) {
        produtosRepository.save(produtos);
    }

    public List<Produto> listarTodosProdutos() {
        return produtosRepository.findAll();
    }

    public void atualizar(Long id, Produto produto) {
        if (produtosRepository.findById(id).isPresent()) {
            produtosRepository.save(produto);
        } else {
            throw new IllegalArgumentException("Produto com Id:" + id  + "não encontrado");
        }
    }

    public void deletar(Long id) {
        produtosRepository.deleteById(id);
    }
}