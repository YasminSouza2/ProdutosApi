package testeprimeiroprojetospring.produtosapi.controller;


import org.springframework.web.bind.annotation.*;
import testeprimeiroprojetospring.produtosapi.model.Produto;
import testeprimeiroprojetospring.produtosapi.repository.ProdutoRepository;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto Recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello, World";
    }

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);

    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id,
                          @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam(value = "nome", required = false) String nome) {
        if (nome != null) {
            return produtoRepository.findByNome(nome);
        }
        return produtoRepository.findAll();
    }
}
