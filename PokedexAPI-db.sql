create database PokedexAPI;
use PokedexAPI;

create table pokemon(
	imagem varchar(30) not null,
	numero integer not null primary key,
    nome varchar(20) not null,
    descricao varchar(150) not null,
    tipo1 varchar(12) not null,
    tipo2 varchar(12)
);