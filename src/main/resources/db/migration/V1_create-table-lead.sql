CREATE TABLE tblead(
	id bigint primary key auto_increment,
    nome varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    telefone varchar(100) NOT NULL,
    PRIMARY KEY(id)
)

CREATE TABLE genero(
	id bigint primary key auto_increment,
    nome varchar(100) NOT NULL,
)

CREATE TABLE personagem(
    id bigint primary key auto_increment,
    nome varchar(30) NOT NULL ,
    arquetipo varchar(100) NOT NULL,
    historia text(5000),
    personalidade varchar(40),
    motivacoes varchar(30),
    aparencia text(5000) NOT NULL
)