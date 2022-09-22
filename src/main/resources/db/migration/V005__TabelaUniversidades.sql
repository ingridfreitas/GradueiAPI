CREATE TABLE universidades(
id int not null primary key auto_increment,
nome_universidade varchar(200),
sigla varchar(200),
instituicao varchar(200)
);
insert into universidades(nome_universidade,sigla,instituicao) values ('Universidade Paulista', 'Unip', 'Privada');
insert into universidades(nome_universidade,sigla,instituicao) values ('Universidade Estadual Paulista', 'Unesp', 'Pública');
insert into universidades(nome_universidade,sigla,instituicao) values ('Centro Universitário Sagrado Coração', 'Unisagrado', 'Privada');
insert into universidades(nome_universidade,sigla,instituicao) values ('Universidade de São Paulo', 'USP', 'Pública');
insert into universidades(nome_universidade,sigla,instituicao) values ('Universidade Presbiteriana Mackenzie', 'UPM', 'Privada');
insert into universidades(nome_universidade,sigla,instituicao) values ('Universidade Estadual de Campinas', 'Unicamp', 'Pública');
insert into universidades(nome_universidade,sigla,instituicao) values ('Faculdade de Tecnologia', 'Fatec', 'Pública');
insert into universidades(nome_universidade,sigla,instituicao) values ('Universidade Estadual de São Paulo', 'Univesp', 'Pública');