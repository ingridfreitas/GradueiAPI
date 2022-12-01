CREATE TABLE polos(
id int not null primary key auto_increment,
nome_polo varchar(200) not null,
latitude varchar(200) not null,
longitude varchar(200) not null,
universidade_id int not null,
cidade_id int not null
);

INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('FMVZ','-22.8895144', '-48.5679556', 2, 35);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('FMB','-22.8913045', '-48.4956466', 2, 35);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('FCA','-22.8513295', '-48.4362545', 2, 35);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('FEB','-22.3501428', '-49.0358031', 2, 11);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('FAAC','-22.3501302', '-49.0358308', 2, 11);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('FC','-22.3481704', '-49.0336813', 2, 11);

INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('FMUSP','-22.3347566', '-49.0628424', 12, 36);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('Teste','-22.3347566', '-49.0628424', 12, 35);
INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('USC','-22.3347566', '-49.0628424', 4, 11);

INSERT INTO polos(nome_polo, latitude, longitude, universidade_id, cidade_id) VALUES ('ENF','-22.9125142', '-48.4650364', 13, 35);





