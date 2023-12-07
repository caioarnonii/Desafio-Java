CREATE DATABASE IF NOT EXISTS desafioJava;
USE desafioJava;

CREATE TABLE IF NOT EXISTS Usuario (
  idUsuario INT NOT NULL,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(100) NOT NULL,
  PRIMARY KEY (idUsuario)
  ) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS Computador (
  idComputador INT NOT NULL,
  fkUsuario INT NOT NULL,
  ip VARCHAR(100) NOT NULL,
  sistemaOperacional VARCHAR(45) NOT NULL,
  fabricante VARCHAR(45) NOT NULL,
  tempoAtividade VARCHAR(45) NOT NULL,
  PRIMARY KEY (idComputador),
  FOREIGN KEY (fkUsuario) REFERENCES Usuario (idUsuario)
) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS UnidadeMedida (
  idUnidadeMedida INT NOT NULL,
  tipoMedida VARCHAR(45) NOT NULL,
  PRIMARY KEY (idUnidadeMedida)
) AUTO_INCREMENT = 1;


CREATE TABLE IF NOT EXISTS Componente (
  idComponente INT NOT NULL,
  fkUnidadeMedida INT NOT NULL,
  nomeComponente VARCHAR(45) NOT NULL,
  PRIMARY KEY (idComponente, fkUnidadeMedida),
  FOREIGN KEY (fkUnidadeMedida) REFERENCES UnidadeMedida (idUnidadeMedida)
) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS ComputadorComponente (
  fkComputador INT NOT NULL,
  fkComponente INT NOT NULL,
  idComputadorComponente INT NOT NULL,
  PRIMARY KEY (idComputadorComponente),
  FOREIGN KEY (fkComputador) REFERENCES Computador (idComputador),
  FOREIGN KEY (fkComponente) REFERENCES Componente (idComponente)
) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS Registro (
  idRegistro INT NOT NULL,
  dadoRegistro VARCHAR(100),
  dataHora DATETIME,
  fkComputadorComponente INT NOT NULL,
  PRIMARY KEY (idRegistro),
  FOREIGN KEY (fkComputadorComponente) REFERENCES ComputadorComponente (fkComputador)
) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS UnidadeMedida (
  idUnidadeMedida INT NOT NULL,
  tipoMedida VARCHAR(45),
  PRIMARY KEY (idUnidadeMedida)
) AUTO_INCREMENT = 1;

CREATE USER IF NOT EXISTS 'JavaUser'@'%' IDENTIFIED BY 'Java2@23';

GRANT ALL PRIVILEGES ON desafioJava.* TO 'JavaUser'@'%';

FLUSH PRIVILEGES;




