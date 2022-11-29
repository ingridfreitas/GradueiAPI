CREATE TABLE polocurso(
id int not null primary key auto_increment,
nota int,
link varchar(200),
polo_id int not null,
curso_id int not null);

INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 1, 65);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 1, 44);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 2, 43);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 2, 24);

INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 7, 43);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 8, 43);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 9, 24);

INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('2', '...', 10, 24);


