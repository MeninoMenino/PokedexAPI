create database PokedexAPI;
use PokedexAPI;

create table pokemon(
	number integer not null primary key,
    name varchar(20) not null,
    description varchar(300) not null,
    type1 varchar(15) not null,
    type2 varchar(15)
);

select * from pokemon;

create table user(
	id integer primary key not null auto_increment,
    name varchar(50),
    email varchar(50),
    password varchar(150)
);
insert into user (name, email, password) values ("Menino", "menino@menino.com", "$2a$10$Rac6HVv3.DsP0JW3.8OIA.hMT5HUNIcTtuHlFR8DkptQLITLqHo3e");
select * from user;