package br.com.fiap.coleta_lixo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "t_coleta")
public class Coleta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_coleta")
    @SequenceGenerator(name = "sq_coleta", sequenceName = "sq_coleta", allocationSize = 1)
    @Column(name = "id_coleta")
    private Long idColeta;

    @NotNull(message = "idColetor é um campo obrigatório.")
    @Column(name = "id_coletor")
    private Long idColetor;

    @NotNull(message = "Data do agendamento é um campo obrigatório.")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "data_agendamento")
    private LocalDate dataAgendamento;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "data_coleta")
    private LocalDate dataColeta;

    @NotBlank(message = "Status é um campo obrigatório.")
    private String status;

    @NotBlank(message = "Endereço é um campo obrigatório.")
    private String endereco;
}
