package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.PolosCursos;
import br.com.tcc.projetoGraduei.repository.cursos.PolosCursosRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolosCursosRepository extends JpaRepository<PolosCursos, Integer>, PolosCursosRepositoryQuery {
}
