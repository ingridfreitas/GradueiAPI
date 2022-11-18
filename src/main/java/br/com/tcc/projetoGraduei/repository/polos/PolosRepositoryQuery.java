package br.com.tcc.projetoGraduei.repository.polos;

import br.com.tcc.projetoGraduei.dto.CidadeEstado;
import br.com.tcc.projetoGraduei.dto.PolosCidades;
import br.com.tcc.projetoGraduei.dto.PolosUniversidades;

import java.util.List;

public interface PolosRepositoryQuery {
    public List<PolosUniversidades> listarPoloUni(String categoria);

    public List<PolosCidades> listarPoloCidade(String nome_cidade);

}
