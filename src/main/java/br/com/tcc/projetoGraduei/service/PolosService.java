package br.com.tcc.projetoGraduei.service;

import br.com.tcc.projetoGraduei.model.Polos;
import br.com.tcc.projetoGraduei.repository.PolosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolosService {
    @Autowired
    private PolosRepository polosRepository;
    public List<Polos> listarPolos(){return polosRepository.findAll();}
}
