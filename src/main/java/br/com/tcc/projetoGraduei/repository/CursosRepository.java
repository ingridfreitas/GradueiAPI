package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Integer> {

}
