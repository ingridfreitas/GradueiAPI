CREATE TABLE polocurso(
id int not null primary key auto_increment,
nota int,
link varchar(200),
polo_id int not null,
curso_id int not null);

INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('0', '...', 1, 1);