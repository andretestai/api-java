package br.com.fiap.coleta_lixo.controller;

import br.com.fiap.coleta_lixo.model.Coleta;
import br.com.fiap.coleta_lixo.service.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coleta-lixo")
public class ColetaController {
    @Autowired
    private ColetaService service;

    @PostMapping("/coletas")
    @ResponseStatus(HttpStatus.CREATED)
    public Coleta insert(@RequestBody Coleta coleta) {
        return service.insert(coleta);
    }

    @GetMapping("/coletas")
    @ResponseStatus(HttpStatus.OK)
    public List<Coleta> listAll() {
        return service.listAll();
    }

    @GetMapping("/coletas/{id}")
    public Coleta findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/coletas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}