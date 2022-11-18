package br.com.tcc.projetoGraduei.dto;

import br.com.tcc.projetoGraduei.model.Cursos;
import br.com.tcc.projetoGraduei.model.Polos;
import br.com.tcc.projetoGraduei.model.PolosCursos;

public class CursosPolos {
    private Integer id;
    private Cursos cursos;
    private Polos polos;

    public CursosPolos(Integer id, Cursos cursos, Polos polos) {
        this.id = id;
        this.cursos = cursos;
        this.polos = polos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public Polos getPolos() {
        return polos;
    }

    public void setPolos(Polos polos) {
        this.polos = polos;
    }
}