package br.com.tcc.projetoGraduei.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_curso;
    private String duracao;
    private String descricao;
    private String img;

    @JsonIgnore
    @OneToMany(mappedBy = "cursos")
    private List<PolosCursos> polosCursos = new ArrayList<>();

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<PolosCursos> getPolosCursos() {
        return polosCursos;
    }

    public void setPolosCursos(List<PolosCursos> polosCursos) {
        this.polosCursos = polosCursos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return id.equals(cursos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
