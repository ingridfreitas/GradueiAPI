CREATE TABLE polos(
id int not null primary key auto_increment,
nome_polo varchar(200) not null,
latitude varchar(200) not null,
longitude varchar(200) not null,
universidade_id int not null,
cidade_id int not null
);

INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('Unip-Bauru','-22.3712341', '-49.0343832', 5, 11);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('Unisagrado-Bauru','-22.3277078', '-49.0553985', 4, 11);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('Unesp-Bauru','-22.3474826', '-49.0339537', 2, 11);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('Unesp-Botucatu','-22.8914667', '-48.5005774', 2, 12);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('GalBotuca','-22.9125143', '-48.4627404', 13, 12);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('UspBauru','-22.3347616', '-49.0605411', 12, 11);