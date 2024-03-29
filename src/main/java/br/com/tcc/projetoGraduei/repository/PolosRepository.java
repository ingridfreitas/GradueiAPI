package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.Polos;
import br.com.tcc.projetoGraduei.repository.polos.PolosRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolosRepository extends JpaRepository<Polos, Integer>, PolosRepositoryQuery {

}
