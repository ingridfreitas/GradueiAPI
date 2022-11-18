package br.com.tcc.projetoGraduei.dto;

import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.model.Universidades;

public class PolosCidades {
    private Integer id;
    private Cidades cidades;
    private Universidades universidades;

    public PolosCidades(Integer id, Cidades cidades, Universidades universidades) {
        this.id = id;
        this.cidades = cidades;
        this.universidades = universidades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }

    public Universidades getUniversidades() {
        return universidades;
    }

    public void setUniversidades(Universidades universidades) {
        this.universidades = universidades;
    }
}
