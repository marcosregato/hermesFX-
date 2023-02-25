-- ESTADO

INSERT INTO estado (id, nome) VALUES(1, 'Acre');
INSERT INTO estado (id, nome) VALUES(2, 'Alagoas');
INSERT INTO estado (id, nome) VALUES(3, 'Amazonas');
INSERT INTO estado (id, nome) VALUES(4, 'Amapá');
INSERT INTO estado (id, nome) VALUES(5, 'Bahia');
INSERT INTO estado (id, nome) VALUES(6, 'Ceará');
INSERT INTO estado (id, nome) VALUES(7, 'Distrito Federal');
INSERT INTO estado (id, nome) VALUES(8, 'Espírito Santo');
INSERT INTO estado (id, nome) VALUES(9, 'Goiás');
INSERT INTO estado (id, nome) VALUES(10, 'Maranhão');
INSERT INTO estado (id, nome) VALUES(11, 'Minas Gerais');
INSERT INTO estado (id, nome) VALUES(12, 'Mato Grosso do Sul');
INSERT INTO estado (id, nome) VALUES(13, 'Mato Grosso');
INSERT INTO estado (id, nome) VALUES(14, 'Pará');
INSERT INTO estado (id, nome) VALUES(15, 'Paraíba');
INSERT INTO estado (id, nome) VALUES(16, 'Pernambuco');
INSERT INTO estado (id, nome) VALUES(17, 'Piauí');
INSERT INTO estado (id, nome) VALUES(18, 'Paraná');
INSERT INTO estado (id, nome) VALUES(19, 'Rio de Janeiro');
INSERT INTO estado (id, nome) VALUES(20, 'Rio Grande do Norte');
INSERT INTO estado (id, nome) VALUES(21, 'Rondônia');
INSERT INTO estado (id, nome) VALUES(22, 'Roraima');
INSERT INTO estado (id, nome) VALUES(23, 'Rio Grande do Sul');
INSERT INTO estado (id, nome) VALUES(24, 'Santa Catarina');
INSERT INTO estado (id, nome) VALUES(25, 'Sergipe');
INSERT INTO estado (id, nome) VALUES(26, 'São Paulo');
INSERT INTO estado (id, nome) VALUES(27, 'Tocantins');
INSERT INTO estado (id, nome) VALUES(99, 'Exterior');

-- CARGO

INSERT INTO cargo VALUES(1,'Venerável Mestre');
INSERT INTO cargo VALUES(2,'Primeiro Vigilante');
INSERT INTO cargo VALUES(3,'Segundo Vigilante');
INSERT INTO cargo VALUES(4,'Primeiro Diácono');
INSERT INTO cargo VALUES(5,'Segundo Diácono');
INSERT INTO cargo VALUES(6,'Tesoureiro');
INSERT INTO cargo VALUES(7,'Secretário');
INSERT INTO cargo VALUES(8,'Orador');
INSERT INTO cargo VALUES(9,'Secretário');
INSERT INTO cargo VALUES(10,'Guarda do Templo');
INSERT INTO cargo VALUES(11,'Mestre de Cerimônias');
INSERT INTO cargo VALUES(12,'Chanceler');
INSERT INTO cargo VALUES(13,'Hospitaleiro');
INSERT INTO cargo VALUES(14,'Arquiteto');
INSERT INTO cargo VALUES(15,'Mestre de Banquetes');
INSERT INTO cargo VALUES(16,'Porta Estandarte');
INSERT INTO cargo VALUES(17,'Porta Espadas');
INSERT INTO cargo VALUES(18,'Bibliotecário');
INSERT INTO cargo VALUES(19,'Mestre de Harmonia');
INSERT INTO cargo VALUES(20,'Cobridor Externo');
INSERT INTO cargo VALUES(21,'Expertos');
INSERT INTO cargo VALUES(22,'Mestre de Cerimônias');

-- PESSOA

INSERT INTO pessoa (id, idEstado ,idCargo, nome, endereco, telefone) VALUES(1, 1, 1, 'mario', 'endereco_1', 'telefone_01');
INSERT INTO pessoa (id, idEstado ,idCargo, nome, endereco, telefone) VALUES(2, 2, 2, 'joao', 'endereco_2', 'telefone_02');
INSERT INTO pessoa (id, idEstado ,idCargo, nome, endereco, telefone) VALUES(3, 3, 3, 'carlos', 'endereco_3', 'telefone_03');
INSERT INTO pessoa (id, idEstado ,idCargo, nome, endereco, telefone) VALUES(4, 4, 4, 'antonio', 'endereco_4', 'telefone_04');

-- LOGIN
INSERT INTO login (id, idPessoa, login, senha) VALUES(1,1, 'mario_1', 'endereco_1@endereco_1');
INSERT INTO login (id, idPessoa, login, senha) VALUES(2,2,'mario_2', 'endereco_2@endereco_2');
INSERT INTO login (id, idPessoa, login, senha) VALUES(3,3, 'mario_3', 'endereco_3@endereco_3');

-- RITO

INSERT INTO rito(id,nome) VALUES(1,'Rito Adonhiramita');
INSERT INTO rito(id,nome) VALUES(2,'Rito Brasileiro');
INSERT INTO rito(id,nome) VALUES(3,'Ritual de Emulação & Sistema Inglês Moderno');
INSERT INTO rito(id,nome) VALUES(4,'Rito Escocês Antigo e Aceito');
INSERT INTO rito(id,nome) VALUES(5,'Rito Francês ou Moderno');
INSERT INTO rito(id,nome) VALUES(6,'Rito Schroder');
INSERT INTO rito(id,nome) VALUES(7,'Rito de York');

-- POTENCIA

INSERT INTO potencia(id,nome) VALUES(1,'GOB');
INSERT INTO potencia(id,nome) VALUES(2,'CMSB');
INSERT INTO potencia(id,nome) VALUES(3,'COMAB');
INSERT INTO potencia(id,nome) VALUES(4,'Grande Oriente Brasileiro');
INSERT INTO potencia(id,nome) VALUES(5,'CMSB'); #Confederação da Maçonaria Simbólica do Brasil


-- DESPESA

INSERT INTO despesa(id,nome) VALUES(1,'LAZER');
INSERT INTO despesa(id,nome) VALUES(2,'MÓVEIS E UTENSÍLIOS');
INSERT INTO despesa(id,nome) VALUES(3,'OUTRAS DISPESAS');
INSERT INTO despesa(id,nome) VALUES(4,'OUTRAS RECEITAS');
INSERT INTO despesa(id,nome) VALUES(5,'SALÁRIO');
INSERT INTO despesa(id,nome) VALUES(6,'SAÚDE');
INSERT INTO despesa(id,nome) VALUES(7,'VEÍCULOS');

-- ESTADO

Insert into estado (id, nome, uf) values (1, 'Acre', 'AC');
Insert into estado (id, nome, uf) values (2, 'Alagoas', 'AL');
Insert into estado (id, nome, uf) values (3, 'Amapá', 'AP');
Insert into estado (id, nome, uf) values (4, 'Amazonas', 'AM');
Insert into estado (id, nome, uf) values (5, 'Bahia', 'BA');
Insert into estado (id, nome, uf) values (6, 'Ceará', 'CE');
Insert into estado (id, nome, uf) values (7, 'Distrito Federal', 'DF');
Insert into estado (id, nome, uf) values (8, 'Espírito Santo', 'ES');
Insert into estado (id, nome, uf) values (9, 'Goiás','GO');
Insert into estado (id, nome, uf) values (10, 'Maranhão', 'MA');
Insert into estado (id, nome, uf) values (11, 'Mato Grosso', 'MT');
Insert into estado (id, nome, uf) values (12, 'Mato Grosso do Sul', 'MS');
Insert into estado (id, nome, uf) values (13, 'Minas Gerais', 'MG');
Insert into estado (id, nome, uf) values (14, 'Pará', 'PA');
Insert into estado (id, nome, uf) values (15, 'Paraíba', 'PB');
Insert into estado (id, nome, uf) values (16, 'Paraná', 'PR');
Insert into estado (id, nome, uf) values (17, 'Pernambuco', 'PE');
Insert into estado (id, nome, uf) values (18, 'Piauí', 'PI');
Insert into estado (id, nome, uf) values (19, 'Rio de Janeiro', 'RJ');
Insert into estado (id, nome, uf) values (20, 'Rio Grande do Norte', 'RN');
Insert into estado (id, nome, uf) values (21, 'Rio Grande do Sul', 'RS');
Insert into estado (id, nome, uf) values (22, 'Rondônia', 'RO');
Insert into estado (id, nome, uf) values (23, 'Roraima', 'RR');
Insert into estado (id, nome, uf) values (24, 'Santa Catarina', 'SC');
Insert into estado (id, nome, uf) values (25, 'São Paulo', 'SP');
Insert into estado (id, nome, uf) values (26, 'Sergipe', 'SE');
Insert into estado (id, nome, uf) values (27, 'Tocantins', 'TO');

-- LOJA

INSERT INTO loja (id,idPessoa,idRito,idPotencia,idEstado,nome,endereco,bairro,cep,municipio,telefone,email,cnpj,dtFundacao)VALUES (1,1,1,1,1,'nome_1','endereco_1','bairro_1','cep_1','municipio_1','telefone_1','email_1','cnpj_1','dtFundacao1');
INSERT INTO loja (id,idPessoa,idRito,idPotencia,idEstado,nome,endereco,bairro,cep,municipio,telefone,email,cnpj,dtFundacao)VALUES (2,2,2,2,2,'nome_2','endereco_2','bairro_2','cep_2','municipio_2','telefone_2','email_2','cnpj_2','dtFundacao2');
INSERT INTO loja (id,idPessoa,idRito,idPotencia,idEstado,nome,endereco,bairro,cep,municipio,telefone,email,cnpj,dtFundacao)VALUES (3,3,3,3,3,'nome_3','endereco_3','bairro_3','cep_3','municipio_3','telefone_3','email_3','cnpj_3','dtFundacao3');

