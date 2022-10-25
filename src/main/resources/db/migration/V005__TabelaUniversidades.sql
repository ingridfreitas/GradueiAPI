CREATE TABLE universidades(
id int not null primary key auto_increment,
nome_universidade varchar(200),
sigla varchar(200),
categoria varchar(25),
img varchar(200)
);
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Paulista', 'Unip', 'Privada', '/assets/logo/unip.png');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Estadual Paulista', 'Unesp', 'Pública', '/assets/logo/unesp.pmg');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Centro Universitário Sagrado Coração', 'Unisagrado', 'Privada', '/assets/logo/unisagrado.png');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade de São Paulo', 'USP', 'Pública', '/assets/logo/usp.png');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Presbiteriana Mackenzie', 'UPM', 'Privada', '/assets/logo/upm.png');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Estadual de Campinas', 'Unicamp', 'Pública', '/assets/logo/unicamp.png');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Faculdade de Tecnologia', 'Fatec', 'Pública', '/assets/logo/fatec.png');
insert into universidades(nome_universidade,sigla, categoria, img) values ('Universidade Estadual de São Paulo', 'Univesp', 'Pública', '/assets/logo/univesp.png');