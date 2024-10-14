package br.com.fiap.coleta_lixo.service;

import br.com.fiap.coleta_lixo.exception.ConteudoNaoEncontradoException;
import br.com.fiap.coleta_lixo.model.Coleta;
import br.com.fiap.coleta_lixo.repository.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColetaService {
    @Autowired
    private ColetaRepository repository;

    public Coleta insert(Coleta coleta) {
        return repository.save(coleta);
    }

    public Coleta findById(Long id) {
        Optional<Coleta> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new ConteudoNaoEncontradoException("Coleta não encontrado.");
        }
    }

    public List<Coleta> listAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        Optional<Coleta> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
        } else {
           throw new ConteudoNaoEncontradoException("Coleta não encontrada.");
        }
    }
}
