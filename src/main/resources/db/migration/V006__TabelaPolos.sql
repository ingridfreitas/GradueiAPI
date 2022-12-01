CREATE TABLE polos(
id int not null primary key auto_increment,
nome_polo varchar(200) not null,
latitude varchar(200) not null,
longitude varchar(200) not null,
universidade_id int not null,
cidade_id int not null
);

INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('Unip-Bauru','-22.3712341', '-49.0343832', 5, 11);





