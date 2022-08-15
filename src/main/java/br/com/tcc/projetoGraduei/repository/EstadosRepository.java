package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EstadosRepository extends JpaRepository<Estados,Integer> {
}
