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
CREATE DATABASE filmes;
USE filmes;

CREATE TABLE filmes(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
diretor VARCHAR(100),
categoria VARCHAR(50),
faixa_etaria VARCHAR(20),
ator_principal VARCHAR(100),
idioma_original VARCHAR(50),
legenda BOOLEAN,
dublado BOOLEAN,
tempo_filme SMALLINT ,
ano SMALLINT ,
faturmento DOUBLE,
orcamento DOUBLE
);
