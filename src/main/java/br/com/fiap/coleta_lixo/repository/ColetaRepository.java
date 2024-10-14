package br.com.fiap.coleta_lixo.repository;

import br.com.fiap.coleta_lixo.model.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetaRepository extends JpaRepository<Coleta, Long> {
}
