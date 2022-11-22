package br.com.tcc.projetoGraduei.repository.cursos;

import br.com.tcc.projetoGraduei.dto.CursosPolos;

import java.util.List;

public interface PolosCursosRepositoryQuery {
    public List<CursosPolos> listarPoloCurso(String nome_curso);

    public List<CursosPolos> listarCursoPolo(String nome_polo);

}
