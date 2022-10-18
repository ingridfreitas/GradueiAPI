ALTER TABLE polocurso ADD CONSTRAINT fk_polocurso_curso FOREIGN KEY(curso_id) REFERENCES cursos(id);
ALTER TABLE polocurso ADD CONSTRAINT fk_polocurso_polo FOREIGN KEY(polo_id) REFERENCES polos(id);