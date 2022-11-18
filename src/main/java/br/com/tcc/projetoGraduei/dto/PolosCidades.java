package br.com.tcc.projetoGraduei.dto;

import br.com.tcc.projetoGraduei.model.Cidades;

public class PolosCidades {
    private Integer id;
    private String nome_polo;
    private Cidades cidades;

    public PolosCidades(Integer id, String nome_polo, Cidades cidades) {
        this.id = id;
        this.nome_polo = nome_polo;
        this.cidades = cidades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_polo() {
        return nome_polo;
    }

    public void setNome_polo(String nome_polo) {
        this.nome_polo = nome_polo;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }
}
