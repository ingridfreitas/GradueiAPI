package br.com.tcc.projetoGraduei.dto;

import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.model.Universidades;

public class PolosCidades {
    private Integer id;
    private String nome_polo;
    private Cidades cidades;
    private Universidades universidades;

    public PolosCidades(Integer id, String nome_polo, Cidades cidades, Universidades universidades) {
        this.id = id;
        this.nome_polo = nome_polo;
        this.cidades = cidades;
        this.universidades = universidades;
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

    public Universidades getUniversidades() {
        return universidades;
    }

    public void setUniversidades(Universidades universidades) {
        this.universidades = universidades;
    }
}
