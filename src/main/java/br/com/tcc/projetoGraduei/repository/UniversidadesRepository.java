package br.com.tcc.projetoGraduei.repository;

import br.com.tcc.projetoGraduei.model.Universidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadesRepository extends JpaRepository<Universidades, Integer> {
}
