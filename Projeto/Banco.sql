CREATE TABLE pessoa(
	id_pessoa serial primary key,
	primeiroNome varchar(255),
	segundoNome varchar(255),
	dataNasc varchar(255),
	Rg varchar(20),
	Cpf varchar(25),
	estadoCivil varchar(150),
	endereco varchar(255),
	numero integer,
	cidade varchar(255),
	estado varchar(255)
)

CREATE TABLE trabalho(
	id_trabalho serial primary key,
	instituicao varchar(255),
	funcao varchar(255),
	salario double precision,
	responsavel varchar(255),
	obsDesc varchar(1000)
)

SELECT * FROM pessoa, trabalho 