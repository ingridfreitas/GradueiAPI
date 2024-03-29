package br.com.tcc.projetoGraduei.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table( name = "universidades")
public class Universidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_universidade;
    private String sigla;
    private String categoria;
    private String img;
    private String link;

    @JsonIgnore
    @OneToMany(mappedBy = "universidades")
    private List<Polos> polos = new ArrayList<>();

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_universidade() {
        return nome_universidade;
    }

    public void setNome_universidade(String nome_universidade) {
        this.nome_universidade = nome_universidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Polos> getPolos() {
        return polos;
    }

    public void setPolos(List<Polos> polos) {
        this.polos = polos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universidades that = (Universidades) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
