CREATE SCHEMA IF NOT EXISTS `CadastroClientes1` DEFAULT CHARACTER SET utf8 ;

use cadastroclientes1;

CREATE TABLE IF NOT EXISTS `CadastroClientes1`.`email` (
  `idemail` INT NOT NULL AUTO_INCREMENT,
  `endereco` VARCHAR(45) NULL,
  PRIMARY KEY (`idemail`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `CadastroClientes1`.`telefone` (
  `idtelefone` INT NOT NULL AUTO_INCREMENT,
  `numero` VARCHAR(45) NULL,
  PRIMARY KEY (`idtelefone`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `CadastroClientes1`.`endereco` (
  `idEndereco` INT NOT NULL AUTO_INCREMENT,
  `rua` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `numero` VARCHAR(45) NULL,
  `cep` VARCHAR(45) NULL,
  PRIMARY KEY (`idEndereco`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `CadastroClientes1`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `cnpj` VARCHAR(45) NULL,
  `idEnderecoFK` INT NOT NULL,
  `idEmailFK` INT NOT NULL,
  `idTelefoneFK` INT NOT NULL,
  `UF` VARCHAR(2) NULL,
  PRIMARY KEY (`idCliente`, `idEnderecoFK`, `idEmailFK`, `idTelefoneFK`),
  INDEX `fk_Cliente_Endereco1_idx` (`idEnderecoFK` ASC),
  INDEX `fk_Cliente_Email1_idx` (`idEmailFK` ASC),
  INDEX `fk_Cliente_telefone1_idx` (`idTelefoneFK` ASC),
  CONSTRAINT `fk_Cliente_Endereco1`
    FOREIGN KEY (`idEnderecoFK`)
    REFERENCES `CadastroClientes1`.`endereco` (`idEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_Email1`
    FOREIGN KEY (`idEmailFK`)
    REFERENCES `CadastroClientes1`.`email` (`idemail`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_telefone1`
    FOREIGN KEY (`idTelefoneFK`)
    REFERENCES `CadastroClientes1`.`telefone` (`idtelefone`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `CadastroClientes1`.`responsavel` (
  `idResponsavel` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `cpf` VARCHAR(45) NULL,
  `idClienteFK` INT NOT NULL,
  PRIMARY KEY (`idResponsavel`, `idClienteFK`),
  INDEX `fk_Responsavel_Cliente_idx` (`idClienteFK` ASC),
  CONSTRAINT `fk_Responsavel_Cliente`
    FOREIGN KEY (`idClienteFK`)
    REFERENCES `CadastroClientes1`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;







