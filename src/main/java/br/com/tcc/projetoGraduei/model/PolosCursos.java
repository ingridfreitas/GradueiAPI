package br.com.tcc.projetoGraduei.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "poloscursos")
public class PolosCursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolosCursos that = (PolosCursos) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @JoinColumn(name = "polo_id")
    @OneToMany
    private Polos polos;

    public Polos getPolos() {
        return polos;
    }

    public void setPolos(Polos polos) {
        this.polos = polos;
    }

    @JoinColumn(name = "curso_id")
    @OneToMany
    private Cursos cursos;

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }
}
