ALTER TABLE t_coleta ADD (
    CONSTRAINT fk_coleta_coletor
        FOREIGN KEY (id_coletor) REFERENCES t_coletor (id_coletor),
    CONSTRAINT uk_coleta_status CHECK (status IN(
        'COMPLETA',
        'INCOMPLETA'
    ))
);

ALTER TABLE t_coletor ADD (
    CONSTRAINT uk_coletor_status CHECK (status IN(
        'ATIVO',
        'INATIVO'
    )),
    CONSTRAINT uk_coletor_periodo_trabalho CHECK (periodo_trabalho IN(
        'INTEGRAL',
        'DIURNO',
        'VESPERTINO'
    ))
);