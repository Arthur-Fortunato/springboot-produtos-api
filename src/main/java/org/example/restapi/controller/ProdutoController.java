package org.example.restapi.controller;

import org.example.restapi.entity.Produto;
import org.example.restapi.service.ProdutoService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {
   private final ProdutoService produtosService;

   public ProdutoController(ProdutoService produtosService) {
       this.produtosService = produtosService;
   }

   public void criarProduto(Produto produto){
       produtosService.criar(produto);
   }

   public List<Produto> listarProdutos() {
       return produtosService.listarTodosProdutos();
   }

   public void atualizarProduto(Long id, Produto produto){
       produtosService.atualizar(id, produto);
   }

   public void deletarProduto(Long id){
       produtosService.deletar(id);
   }
}