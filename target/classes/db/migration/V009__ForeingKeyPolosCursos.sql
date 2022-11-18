ALTER TABLE polocurso ADD CONSTRAINT fk_polocurso_curso FOREIGN KEY(curso_id) REFERENCES cursos(id);
ALTER TABLE polocurso ADD CONSTRAINT fk_polocurso_polo FOREIGN KEY(polo_id) REFERENCES polos(id);
ALTER TABLE polos ADD CONSTRAINT fk_polos_cidades FOREIGN KEY(cidade_id) REFERENCES cidades(id);