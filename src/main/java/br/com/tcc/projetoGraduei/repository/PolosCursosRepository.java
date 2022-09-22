package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.PolosCursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolosCursosRepository extends JpaRepository<PolosCursos, Integer> {
}
