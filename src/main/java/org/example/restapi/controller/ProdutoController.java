package org.example.restapi.controller;

import org.example.restapi.entity.Produto;
import org.example.restapi.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/produtos")
public class ProdutoController {
   private final ProdutoService produtosService;

   public ProdutoController(ProdutoService produtosService) {
       this.produtosService = produtosService;
   }

   @PostMapping
   public void criarProduto(Produto produto){
       produtosService.criar(produto);
   }

   @GetMapping
   public List<Produto> listarProdutos() {
       return produtosService.listarTodosProdutos();
   }

   @PutMapping("{id}")
   public void atualizarProduto(Long id, Produto produto){
       produtosService.atualizar(id, produto);
   }

   @DeleteMapping("{id}")
   public void deletarProduto(Long id){
       produtosService.deletar(id);
   }
}