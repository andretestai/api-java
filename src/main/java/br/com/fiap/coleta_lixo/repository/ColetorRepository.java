package br.com.fiap.coleta_lixo.repository;

import br.com.fiap.coleta_lixo.model.Coletor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetorRepository extends JpaRepository<Coletor, Long> {
}
