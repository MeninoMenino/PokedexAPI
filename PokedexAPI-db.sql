create database PokedexAPI;
use PokedexAPI;

create table pokemon(
	numero integer not null primary key,
    nome varchar(20) not null,
    descricao varchar(300) not null,
    tipo1 varchar(15) not null,
    tipo2 varchar(15)
);

select * from pokemon;

create table usuarios(
	id integer primary key not null auto_increment,
    nome varchar(50),
    email varchar(50),
    senha varchar(20)
);