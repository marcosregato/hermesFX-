#CREATE database hermesDB;

CREATE table estado(
                       id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                       nome varchar(255)
);

CREATE table cargo(
                      id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                      nome varchar(255)
);

create table login(
                      id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                      idPessoa int,
                      login varchar(30),
                      senha varchar(30),
                      FOREIGN KEY (idPessoa) REFERENCES pessoa(id)
);

CREATE table pessoa(
                       id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                       idEstado int,
                       idCargo int,
                       nome varchar(255),
                       endereco varchar(255),
                       telefone varchar(255),
                       bairro varchar(200),
                       cep varchar(200),
                       municipio varchar(255),
                       email varchar(255),
                       FOREIGN KEY (idCargo) REFERENCES cargo(id),
                       FOREIGN KEY (idEstado) REFERENCES estado(id)

);

CREATE table rito(
                     id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                     nome varchar(255)
);

CREATE table potencia(
                         id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                         nome varchar(255)
);

create table despesa(
                        id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                        nome varchar(20)
);

CREATE TABLE loja(
                     id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                     idPessoa int,
                     idRito int,
                     idPotencia int,
                     idEstado int,
                     nome varchar(255),
                     endereco varchar(200),
                     bairro varchar(200),
                     cep varchar(200),
                     municipio varchar(255),
                     telefone varchar(11),
                     email varchar(255),
                     cnpj varchar(255),
                     dtFundacao varchar(11),

                     FOREIGN KEY (idRito) REFERENCES rito(id),
                     FOREIGN KEY (idPessoa) REFERENCES pessoa(id),
                     FOREIGN KEY (idPotencia) REFERENCES potencia(id),
                     FOREIGN KEY (idEstado) REFERENCES estado(id)
);

create table movimentoBancaria(
                                  id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                                  idDispesa int,
                                  idLoja int,
                                  data varchar(10),
                                  valorEntrada int,
                                  valorSaida int,
                                  totalCaixa int,

                                  FOREIGN KEY (idDispesa) REFERENCES despesa(id),
                                  FOREIGN KEY (idLoja) REFERENCES loja(id)
);

CREATE TABLE estado (
                        id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                        nome VARCHAR (50),
                        uf CHAR (2)
);

create TABLE evento(
                       id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
                       idLoja int,
                       nome varchar (50),
                       data varchar (15),

                       FOREIGN KEY (idLoja) REFERENCES loja(id)
);

