package org.example.restapi.controller;

import org.example.restapi.entity.Produto;
import org.example.restapi.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
   private final ProdutoService produtosService;

   public ProdutoController(ProdutoService produtosService) {
       this.produtosService = produtosService;
   }

   @PostMapping
   public void criarProduto(@RequestBody Produto produto){
       produtosService.criar(produto);
   }

   @GetMapping
   public List<Produto> listarProdutos() {
       return produtosService.listarTodosProdutos();
   }

   @GetMapping("{id}")
    public Produto listarProdutoPorId(@PathVariable Long id){
       return produtosService.listarProdutoPorId(id);
   }

   @PutMapping("{id}")
   public void atualizarProduto(@PathVariable Long id, @RequestBody Produto produto){
       produtosService.atualizar(id, produto);
   }

   @DeleteMapping("{id}")
   public void deletarProduto(@PathVariable Long id){
       produtosService.deletar(id);
   }
}