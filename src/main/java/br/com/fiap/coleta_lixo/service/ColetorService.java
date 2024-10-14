package br.com.fiap.coleta_lixo.service;

import br.com.fiap.coleta_lixo.exception.ConteudoNaoEncontradoException;
import br.com.fiap.coleta_lixo.model.Coletor;
import br.com.fiap.coleta_lixo.repository.ColetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColetorService {
    @Autowired
    private ColetorRepository repository;

    public Coletor insert(Coletor coletor) {
        return repository.save(coletor);
    }

    public Coletor findById(Long id) {
        Optional<Coletor> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new ConteudoNaoEncontradoException("Coletor não encontrado.");
        }
    }

    public List<Coletor> listAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        Optional<Coletor> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
        } else {
            throw new ConteudoNaoEncontradoException("Coletor não encontrada.");
        }
    }
}
