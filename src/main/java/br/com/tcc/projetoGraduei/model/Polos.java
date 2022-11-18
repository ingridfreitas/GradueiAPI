package br.com.tcc.projetoGraduei.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "polos")
public class Polos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_polo;
    private String latitude;
    private String longitude;

    @JsonIgnore
    @OneToMany(mappedBy = "polos")
    private List<PolosCursos> polosCursos = new ArrayList<>();

    @JoinColumn(name = "universidade_id")
    @ManyToOne
    private Universidades universidades;

    @JoinColumn(name = "cidade_id")
    @ManyToOne
    private Cidades cidades;

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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<PolosCursos> getPolosCursos() {
        return polosCursos;
    }

    public void setPolosCursos(List<PolosCursos> polosCursos) {
        this.polosCursos = polosCursos;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polos polos = (Polos) o;
        return id.equals(polos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
