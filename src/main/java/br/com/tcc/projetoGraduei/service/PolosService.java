package br.com.tcc.projetoGraduei.service;

import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.model.Polos;
import br.com.tcc.projetoGraduei.model.Universidades;
import br.com.tcc.projetoGraduei.repository.PolosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolosService {
    @Autowired
    private PolosRepository polosRepository;
    public List<Polos> listarPolos(){return polosRepository.findAll();}

    public Polos salvar(Polos polos, Cidades cidades, Universidades universidades) {
        return polosRepository.save(polos);
    }
}
