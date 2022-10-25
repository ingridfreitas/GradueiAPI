package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Cursos, Integer> {


}
