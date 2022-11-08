package br.com.tcc.projetoGraduei.dto;

import br.com.tcc.projetoGraduei.model.Estados;

public class CidadeEstado {
    private Integer id;
    private String nome_cidade;
    private Estados estado;

    public CidadeEstado(Integer id, String nome_cidade, Estados estado) {
        this.id = id;
        this.nome_cidade = nome_cidade;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    public Estados getEstados() {
        return estado;
    }

    public void setEstados(Estados estado) {
        this.estado = estado;
    }
}
