package br.com.fiap.coleta_lixo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "t_coletor")
public class Coletor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_coletor")
    @SequenceGenerator(name  = "sq_coletor", sequenceName = "sq_coletor", allocationSize = 1)
    @Column(name = "id_coletor")
    private Long idColetor;

    @NotBlank(message = "O nome do coletor é um campo obrigatório.")
    private String nome;

    @NotBlank(message = "O telefone do coletor é um campo obrigatório.")
    private String telefone;

    @NotBlank(message = "O email do coletor é um campo obrigatório.")
    @Email(message = "Insira um email válido.")
    private String email;

    @Column(name = "periodo_trabalho")
    private String periodoTrabalho;
    private String status;
}