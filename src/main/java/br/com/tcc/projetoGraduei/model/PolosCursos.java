package br.com.tcc.projetoGraduei.model;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "polocurso")
public class PolosCursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer nota;
    private String link;

    @JoinColumn(name = "polo_id")
    @ManyToOne
    private Polos polos;

    @JoinColumn(name = "curso_id")
    @ManyToOne
    private Cursos cursos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Polos getPolos() {
        return polos;
    }

    public void setPolos(Polos polos) {
        this.polos = polos;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
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
}
