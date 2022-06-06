-- MySQL Script generated by MySQL Workbench
-- Wed May 11 11:48:13 2022
-- Model: New Model    Version: 1.0
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
-- Table `mydb`.`Reserva_Hotel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Reserva_Hotel` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `reserva` VARCHAR(15) NOT NULL,
	`destino` VARCHAR(45) NOT NULL,
  `data_checkin` DATE NOT NULL,
  `data_checkout` DATE NOT NULL,
  `preco` double NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Dados_Passageiro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Dados_Passageiro` (
  `iddados` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(45) NOT NULL,
  `data_nascimento` DATE NOT NULL,
  `documento` VARCHAR(15) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `Reserva_Hotel_id` INT(15),
  `Passagens_aereas_idPassagens` INT(15),
  `Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`iddados`),
  INDEX `fk_Dados_Passageiro_Reserva_Hotel1_idx` (`Reserva_Hotel_id` ASC) VISIBLE,
  INDEX `fk_Dados_Passageiro_Passagens_aereas1_idx` (`Passagens_aereas_idPassagens` ASC) VISIBLE,
  INDEX `fk_Dados_Passageiro_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Dados_Passageiro_Reserva_Hotel1`
    FOREIGN KEY (`Reserva_Hotel_id`)
    REFERENCES `mydb`.`Reserva_Hotel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Dados_Passageiro_Passagens_aereas1`
    FOREIGN KEY (`Passagens_aereas_idPassagens`)
    REFERENCES `mydb`.`Passagens_aereas` (`idPassagens`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Dados_Passageiro_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Passagens_Aereas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Passagens_Aereas` (
  `idPassagens` INT NOT NULL AUTO_INCREMENT,
  `reserva` VARCHAR(15) NOT NULL,
  `origem` VARCHAR(45) NOT NULL,
  `destino` VARCHAR(45) NOT NULL,
  `data_partida` DATE NOT NULL,
  `data_retorno` DATE NOT NULL,
  `preco` double NOT NULL,
  PRIMARY KEY (`idPassagens`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(45) NOT NULL,
  `data_nascimento` DATE NOT NULL,
  `email` VARCHAR(110) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `documento` VARCHAR(15) NOT NULL,
  `usuario` VARCHAR(110) NOT NULL,
  `senha` VARCHAR(110) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;

/* INSERIR */
/* CLIENTE */
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Vinicius Araujo de Oliveira','2001-05-14','viniaraujo@gmail.com','11900000000','00000000000','viniaraujo','pizza123');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Beatriz da Cruz Guedes','2000-10-25','beatriz.guedes@gmail.com','11958000000','2221106117','beaguedes','bcg456');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Julia da Costa Santos','2001-06-23','julia.c.santos@gmail.com','11900000023','2222102677','jusantos','jcs896');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Joana Darc Monteiro Silva','2002-07-05','joana.d@gmail.com','11900066000','2221107593','joanadm','jdms88');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Vitória Akemi Corrêa Arakaki','2003-04-08','vitoria.akemi.arakaki@gmail.com','11902500000','422101990','viarakaki','vaa14');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Murillo Julio Lins de Oliveira','2003-04-08','murillo.oliveira@gmail.com','11900003300','2221108639','moliveira','mjlo78');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Beatriz Rodrigues de Paula','2002-05-21','bepaulinharodrigues@gmail.com','11900140000','3032105741','bearodrigues','brp55');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Rafaela Luz','2003-08-11','rafaelaluz@gmail.com','11900009900','2222103972','rafaluz','rl896');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Valéria Conceição','2000-11-03','valeriaconceicao@gmail.com','11901100000','422107399','vaconceicao','vc5896');
INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES('Guilherme Campbell Gonçalves','1998-12-06','guicampbell@gmail.com','11900220000','58932157899','guicampbell','gcg963');

/* DADOS PASSAGEIROS */
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Vinicius Araujo de Oliveira','2001-05-14','11900000000','00000000000','1','1','1');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Beatriz da Cruz Guedes','2000-10-25','11958000000','2221106117','2','2','2');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Julia da Costa Santos','2001-06-23','11900000023','2222102677','3','3','3');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Joana Darc Monteiro Silva','2002-07-05','11900066000','2221107593','4','4','4');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Vitória Akemi Corrêa Arakaki','2003-04-08','11902500000','422101990','5','5','5');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Murillo Julio Lins de Oliveira','2003-04-08','11900003300','2221108639','6','6','6');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Beatriz Rodrigues de Paula','2002-05-21','11900140000','3032105741','7','7','7');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Rafaela Luz','2003-08-11','11900009900','2222103972','8','8','8');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Valéria Conceição','2000-11-03','11901100000','422107399','9','9','9');
INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES('Guilherme Campbell Gonçalves','1998-12-06','11900220000','58932157899','10','10','10');

/* PASSAGENS AEREAS */
INSERT INTO Passagens_Aereas(reserva,origem,destino,data_partida,data_retorno,preco) VALUES('401CE','São Paulo - Brasil','Nova York - EUA','2022-07-17','2022-07-27','2900.67');
INSERT INTO Passagens_Aereas(reserva,origem,destino,data_partida,data_retorno,preco) VALUES('219CE','São Paulo - Brasil','Paris - França','2022-08-01','2022-08-10','3300.11');
INSERT INTO Passagens_Aereas(reserva,origem,destino,data_partida,data_retorno,preco) VALUES('360CE','São Paulo - Brasil','Amsterdã - Holanda','2022-09-20','2022-09-27','3100.60');
INSERT INTO Passagens_Aereas(reserva,origem,destino,data_partida,data_retorno,preco) VALUES('249CE','São Paulo - Brasil','Ottawa - Canadá','2022-06-10','2022-06-20','5100.11');
INSERT INTO Passagens_Aereas(reserva,origem,destino,data_partida,data_retorno,preco) VALUES('429CE','São Paulo - Brasil','Dubai - Emirados Arábes Unidos','2022-10-18','2022-10-28','4800.48');
INSERT INTO Passagens_Aereas(reserva,origem,destino,data_partida,data_retorno,preco) VALUES('425CE','São Paulo - Brasil','Tokyo - Japão','2022-11-15','2022-11-25','5500.70');

/* RESERVA HOTEL */
INSERT INTO Reserva_Hotel(reserva,destino,data_checkin,data_checkout,preco) VALUES('217B','Nova York - EUA','2022-06-17','2022-06-27','2920.00');
INSERT INTO Reserva_Hotel(reserva,destino,data_checkin,data_checkout,preco) VALUES('118A','Amsterdã - Holanda','2022-07-10','2022-07-20','2800.00');
INSERT INTO Reserva_Hotel(reserva,destino,data_checkin,data_checkout,preco) VALUES('036B','Paris - França','2022-08-05','2022-08-10','3500.00');
INSERT INTO Reserva_Hotel(reserva,destino,data_checkin,data_checkout,preco) VALUES('056A','Tokyo - Japão','2022-09-08','2022-09-27','2800.00');

/* CONSULTA */
SELECT * FROM Cliente;
SELECT * FROM Passagens_Aereas;
SELECT * FROM Dados_Passageiro;
SELECT * FROM Reserva_Hotel;
SELECT * FROM Dados_Passageiro,Passagens_Aereas;
SELECT * FROM Dados_Passageiro,Reserva_Hotel;

/* ATUALIZAR */
UPDATE Cliente SET nome_completo='????????';
UPDATE Passagens_Aereas SET destino='?????';
UPDATE Dados_Passageiro SET documento='??????';
UPDATE Reserva_Hotel SET data_checkin='?????';

/* DELETAR */
DELETE FROM Cliente WHERE nome_completo='??????';
DELETE FROM Passagens_Aereas WHERE idPassagens='?????';
DELETE FROM Dados_Passageiro WHERE nome_completo='?????';
DELETE FROM Reserva_Hotel WHERE documento='?????';

/* DEFAULT - VALORES PADRÃO*/
ALTER TABLE Passagens_Aereas
MODIFY COLUMN destino VARCHAR(45) NOT NULL;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;