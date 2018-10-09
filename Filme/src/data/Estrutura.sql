/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guilherme Henrique Bialas
 * Created: 08/10/2018
 */

DROP DATABASE IF EXISTS filmes;
CREATE DATABESE filmes;
USE filmes;

CREATE TABLE filmes(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
diretor VARCHAR(100),
categoria VARCHAR(50),
faixaEtaria VARCHAR(20),
torPrincipal VARCHAR(100),
idiomaOriginal VARCHAR(50),
legenda BOOLEAN,
dublado BOOLEAN,
tempoFilme int,
ano int,
faturmento DOUBLE,
orcamento DOUBLE);
