drop database projetomusica; 

create database projetomusica; 

USE projetomusica; 

create table projetomusica.usuarios (
  id BIGINT NOT NULL AUTO_INCREMENT,
  login VARCHAR(255),
  senha VARCHAR(255),
  status VARCHAR(255),
  tipo VARCHAR(255),
  id_clientes bigint,
  primary key (id));
  
create table projetomusica.clientes (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  cpf VARCHAR(255),
  produto VARCHAR(255),
  email VARCHAR(255),
  primary key (id));

create table projetomusica.instrumentos (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  valor DOUBLE,
  tipo VARCHAR(255),
  primary key (id));


create table projetomusica.acessorios (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  valor DOUBLE,
  id_instrumentos bigint,
  primary key (id));
  
  create table projetomusica.compras(
	id_compras BIGINT NOT NULL AUTO_INCREMENT primary key, 
	valor_total DOUBLE,
    id_instrumentos BIGINT,
    id_clientes BIGINT
  ); 
  
ALTER TABLE projetomusica.compras ADD CONSTRAINT FK_COMPRASCLIENTES_ID FOREIGN KEY (id_clientes) REFERENCES clientes (ID);
ALTER TABLE projetomusica.compras ADD CONSTRAINT FK_COMPRASINSTRUMENTOS_ID FOREIGN KEY (id_instrumentos) REFERENCES instrumentos (ID);


INSERT INTO `projetomusica`.`clientes` (`nome`, `cpf`, `produto`, `email`) VALUES ('Felipe Sousa', '123456789', 'Instrumento', 'felipesousa.lima@gmail.com');
INSERT INTO `projetomusica`.`clientes` (`nome`, `cpf`, `produto`, `email`) VALUES ('Mark Arthur', '321456789', 'Acessorio', 'markarthur@gmail.com');

INSERT INTO `projetomusica`.`usuarios` (`login`, `senha`, `status`, `tipo`, `id_clientes`) VALUES ('MARCOS', '123456', 'ATIVO', 'CANTOR', 2);
INSERT INTO `projetomusica`.`usuarios` (`login`, `senha`, `status`, `tipo`, `id_clientes`) VALUES ('FELIPE', '654321', 'ATIVO', 'PROFESSOR', 1);

INSERT INTO `projetomusica`.`instrumentos` (`nome`, `valor`, `tipo`) VALUES ('VIOLAO', 400, 'CORDAS');
INSERT INTO `projetomusica`.`instrumentos` (`nome`, `valor`, `tipo`) VALUES ('BAIXO', 200, 'CORDAS');

INSERT INTO `projetomusica`.`acessorios` (`nome`, `valor`, `id_instrumentos`) VALUES ('CAPA', 30, 2);
INSERT INTO `projetomusica`.`acessorios` (`nome`, `valor`, `id_instrumentos`) VALUES ('PALHETAS', 5, 1);

INSERT INTO `projetomusica`.`compras` (`valor_total`,`id_instrumentos`, `id_clientes`) VALUES (120,1,1);