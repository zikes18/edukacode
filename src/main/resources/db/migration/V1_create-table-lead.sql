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
