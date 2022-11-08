package br.com.tcc.projetoGraduei.repository.cidade;

import br.com.tcc.projetoGraduei.dto.CidadeEstado;

import java.util.List;


public interface CidadesRepositoryQuery {
    public List<CidadeEstado> listarCidadeEstado(String nome_estado);

}
