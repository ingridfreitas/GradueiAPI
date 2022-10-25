CREATE TABLE universidades(
id int not null primary key auto_increment,
nome_universidade varchar(200),
sigla varchar(200),
categoria varchar(25),
img varchar(200),
link varchar(250)
);
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Faculdade de Tecnologia', 'Fatec', 'Pública', '/assets/logo/fatec.png', 'http://www.fatecsp.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Universidade Estadual de São Paulo', 'Univesp', 'Pública', '/assets/logo/univesp.png', 'https://univesp.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Universidade Estadual Paulista', 'Unesp', 'Pública', '/assets/logo/unesp.png', 'https://www2.unesp.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Centro Universitário Sagrado Coração', 'Unisagrado', 'Privada', '/assets/logo/unisagrado.png', 'https://unisagrado.edu.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Universidade Paulista', 'Unip', 'Privada', '/assets/logo/unip.png', 'https://www.unip.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Faculdade de Ensino superior e Formação Integral', 'Faef', 'privada', '/assets/logo/faef.png', 'https://www.faef.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Universidade Nove de Julho', 'Uninove', 'Privada', '/assets/logo/uninove.png', 'https://www.uninove.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Universidade Presbiteriana Mackenzie', 'UPM', 'Privada', '/assets/logo/upm.png', 'https://www.mackenzie.br/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Universidade Estadual de Campinas', 'Unicamp', 'Pública', '/assets/logo/unicamp.png', 'https://www.unicamp.br/unicamp/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Pontifícia Universidade Católica de São Paulo', 'PUC', 'Privada', '/assets/logo/puc.png', 'https://www.pucsp.br/home');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Anhanguera', '', 'Privada', '/assets/logo/anhanguera.png', 'https://www.anhanguera.com/');
insert into universidades(nome_universidade,sigla, categoria, img, link) values ('Universidade de São Paulo', 'USP', 'Pública', '/assets/logo/usp.png', 'https://www.usp.org/');
