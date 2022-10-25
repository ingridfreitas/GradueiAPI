CREATE TABLE universidades(
id int not null primary key auto_increment,
nome_universidade varchar(200),
sigla varchar(200),
categoria varchar(25),
img varchar(200)
);
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Paulista', 'Unip', 'Privada', '');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Estadual Paulista', 'Unesp', 'Pública', '');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Centro Universitário Sagrado Coração', 'Unisagrado', 'Privada', '');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade de São Paulo', 'USP', 'Pública', '');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Presbiteriana Mackenzie', 'UPM', 'Privada', '');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Estadual de Campinas', 'Unicamp', 'Pública', '');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Faculdade de Tecnologia', 'Fatec', 'Pública', '');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Estadual de São Paulo', 'Univesp', 'Pública', '');