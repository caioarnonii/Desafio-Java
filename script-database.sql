-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `nome` VARCHAR(100) NULL,
  `email` VARCHAR(100) NULL,
  `senha` VARCHAR(100) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Computador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Computador` (
  `idComputador` INT NOT NULL,
  `fkUsuario` INT NOT NULL,
  `ip` VARCHAR(100) NULL,
  `sistemaOperacional` VARCHAR(45) NULL,
  `fabricante` VARCHAR(45) NULL,
  `tempoAtividade` VARCHAR(45) NULL,
  PRIMARY KEY (`idComputador`),
  INDEX `fk_Computador_Usuario1_idx` (`fkUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Computador_Usuario1`
    FOREIGN KEY (`fkUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`UnidadeMedida`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`UnidadeMedida` (
  `idUnidadeMedida` INT NOT NULL,
  `tipoMedida` VARCHAR(45) NULL,
  PRIMARY KEY (`idUnidadeMedida`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Componente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Componente` (
  `idComponente` INT NOT NULL,
  `fkUnidadeMedida` INT NOT NULL,
  `nomeComponente` VARCHAR(45) NULL,
  PRIMARY KEY (`idComponente`, `fkUnidadeMedida`),
  INDEX `fk_Componente_UnidadeMedida2_idx` (`fkUnidadeMedida` ASC) VISIBLE,
  CONSTRAINT `fk_Componente_UnidadeMedida2`
    FOREIGN KEY (`fkUnidadeMedida`)
    REFERENCES `mydb`.`UnidadeMedida` (`idUnidadeMedida`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ComputadorComponente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ComputadorComponente` (
  `fkComputador` INT NOT NULL,
  `fkComponente` INT NOT NULL,
  `idComputadorComponente` INT NOT NULL,
  PRIMARY KEY (`idComputadorComponente`),
  INDEX `fk_Computador_has_Componente_Componente1_idx` (`fkComponente` ASC) VISIBLE,
  INDEX `fk_Computador_has_Componente_Computador_idx` (`fkComputador` ASC) VISIBLE,
  CONSTRAINT `fk_Computador_has_Componente_Computador`
    FOREIGN KEY (`fkComputador`)
    REFERENCES `mydb`.`Computador` (`idComputador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Computador_has_Componente_Componente1`
    FOREIGN KEY (`fkComponente`)
    REFERENCES `mydb`.`Componente` (`idComponente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Registro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Registro` (
  `idRegistro` INT NOT NULL,
  `dadoRegistro` VARCHAR(100) NULL,
  `dataHora` DATETIME NULL,
  `fkComputadorComponente` INT NOT NULL,
  PRIMARY KEY (`idRegistro`),
  INDEX `fk_Registro_ComputadorComponente1_idx` (`fkComputadorComponente` ASC) VISIBLE,
  CONSTRAINT `fk_Registro_ComputadorComponente1`
    FOREIGN KEY (`fkComputadorComponente`)
    REFERENCES `mydb`.`ComputadorComponente` (`fkComputador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`UnidadeMedida`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`UnidadeMedida` (
  `idUnidadeMedida` INT NOT NULL,
  `tipoMedida` VARCHAR(45) NULL,
  PRIMARY KEY (`idUnidadeMedida`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
