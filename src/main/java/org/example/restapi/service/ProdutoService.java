package org.example.restapi.service;

import org.example.restapi.entity.Produto;
import org.example.restapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    public Produto listarProdutoPorId(Long id) {
        Optional<Produto> produto = produtosRepository.findById(id);
        if (produto.isPresent()) {
            return produto.get();
        } else {
            throw new IllegalArgumentException("Produto de id: " + id + " não encontrado");
        }
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