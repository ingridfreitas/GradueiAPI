package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.repository.cidade.CidadesRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadesRepository extends JpaRepository<Cidades, Integer>, CidadesRepositoryQuery{

}
