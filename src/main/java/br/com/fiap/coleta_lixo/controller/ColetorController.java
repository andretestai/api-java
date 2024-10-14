package br.com.fiap.coleta_lixo.controller;

import br.com.fiap.coleta_lixo.model.Coletor;
import br.com.fiap.coleta_lixo.service.ColetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coleta-lixo")
public class ColetorController {
    @Autowired
    private ColetorService service;

    @PostMapping("/coletores")
    @ResponseStatus(HttpStatus.CREATED)
    public Coletor insert(@RequestBody Coletor coletor) {
        return service.insert(coletor);
    }

    @GetMapping("/coletores")
    @ResponseStatus(HttpStatus.OK)
    public List<Coletor> listAll() {
        return service.listAll();
    }

    @GetMapping("/coletores/{id}")
    public Coletor findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/coletores/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}