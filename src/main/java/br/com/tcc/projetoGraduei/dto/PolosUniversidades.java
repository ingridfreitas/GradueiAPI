package br.com.tcc.projetoGraduei.dto;

import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.model.Universidades;

public class PolosUniversidades {
    private Integer id;
    private Universidades universidades;
    private Cidades cidades;

    public PolosUniversidades(Integer id, Universidades universidades, Cidades cidades) {
        this.id = id;
        this.universidades = universidades;
        this.cidades = cidades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Universidades getUniversidades() {
        return universidades;
    }

    public void setUniversidades(Universidades universidades) {
        this.universidades = universidades;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }
}
