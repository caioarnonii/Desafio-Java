-- Active: 1698205327640@@127.0.0.1@3306@streamoon
DROP DATABASE IF EXISTS desafioJava;
CREATE DATABASE IF NOT EXISTS desafioJava;
USE desafioJava;

CREATE TABLE IF NOT EXISTS UnidadeMedida (
  idUnidadeMedida INT NOT NULL AUTO_INCREMENT,
  tipoMedida VARCHAR(45) NOT NULL,
  PRIMARY KEY (idUnidadeMedida)
) AUTO_INCREMENT = 1;


CREATE TABLE IF NOT EXISTS Componente (
  idComponente INT NOT NULL AUTO_INCREMENT,
  fkUnidadeMedida INT NOT NULL,
  nomeComponente VARCHAR(45) NOT NULL,
  PRIMARY KEY (idComponente, fkUnidadeMedida),
  FOREIGN KEY (fkUnidadeMedida) REFERENCES UnidadeMedida (idUnidadeMedida)
) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS Registro (
  idRegistro INT NOT NULL AUTO_INCREMENT,
  dadoRegistro DOUBLE,
  dataHora DATETIME DEFAULT CURRENT_TIMESTAMP,
  fkComponente INT NOT NULL,
  PRIMARY KEY (idRegistro),
  FOREIGN KEY (fkComponente) REFERENCES Componente (idComponente)
) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS UnidadeMedida (
  idUnidadeMedida INT NOT NULL AUTO_INCREMENT,
  tipoMedida VARCHAR(45),
  PRIMARY KEY (idUnidadeMedida)
) AUTO_INCREMENT = 1;

CREATE USER IF NOT EXISTS 'JavaUser'@'%' IDENTIFIED BY 'Java2@23';

GRANT ALL PRIVILEGES ON desafioJava.* TO 'JavaUser'@'%';

FLUSH PRIVILEGES;


INSERT INTO UnidadeMedida (tipoMedida) VALUES ('%');

INSERT INTO Componente (fkUnidadeMedida, nomeComponente) VALUES
(1, 'CPU'),
(1, 'MEMORIA'),
(1, 'DISCO');

