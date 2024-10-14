CREATE TABLE t_coletor (
    id_coletor NUMBER(10) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    periodo_trabalho VARCHAR(20) NOT NULL,
    status VARCHAR(7) NOT NULL,
    CONSTRAINT pk_coletor PRIMARY KEY (id_coletor)
);

CREATE TABLE t_coleta (
    id_coleta NUMBER(10) NOT NULL,
    id_coletor NUMBER(10) NOT NULL,
    data_agendamento DATE NOT NULL,
    data_coleta DATE,
    status VARCHAR(10) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    CONSTRAINT pk_coleta PRIMARY KEY (id_coleta)
);

CREATE SEQUENCE sq_coletor START WITH 1 INCREMENT BY 1 NOMAXVALUE NOCACHE NOCYCLE;
CREATE SEQUENCE sq_coleta START WITH 1 INCREMENT BY 1 NOMAXVALUE NOCACHE NOCYCLE;