package br.com.tcc.projetoGraduei.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cidades")
public class Cidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_cidade;

    @JsonIgnore
    @OneToMany(mappedBy = "cidades")
    private List<Polos> polos = new ArrayList<>();

    @JoinColumn(name = "estado_id")
    @ManyToOne
    private Estados estado;


    //Getters and Setters
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

    public List<Polos> getPolos() {
        return polos;
    }

    public void setPolos(List<Polos> polos) {
        this.polos = polos;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidades cidades = (Cidades) o;
        return id.equals(cidades.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
