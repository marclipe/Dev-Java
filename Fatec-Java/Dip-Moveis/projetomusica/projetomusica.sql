create database projetomusica; 

create table projetomusica.usuarios (
  id BIGINT NOT NULL AUTO_INCREMENT,
  login VARCHAR(255),
  senha VARCHAR(255),
  status VARCHAR(255),
  tipo VARCHAR(255),
  primary key (id));

create table projetomusica.instrumentos (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  valor TINYINT(4),
  tipo VARCHAR(255),
  primary key (id));


INSERT INTO `projetomusica`.`usuarios` (`login`, `senha`, `status`, `tipo`) VALUES ('MARCOS', '123456', 'ATIVO', 'ADM');
INSERT INTO `projetomusica`.`instrumentos` (`nome`, `valor`, `tipo`) VALUES ('VIOLAO', 400, 'CORDAS');