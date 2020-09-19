DROP TABLE IF EXISTS pokemon;

create table pokemon(
	numero INT AUTO_INCREMENT PRIMARY KEY,
    nome varchar(20) not null,
    descricao varchar(150) not null,
    tipo1 varchar(12) not null,
    tipo2 varchar(12)
);