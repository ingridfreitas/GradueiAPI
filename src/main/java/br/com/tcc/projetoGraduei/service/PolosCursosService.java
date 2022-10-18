package br.com.tcc.projetoGraduei.service;

import br.com.tcc.projetoGraduei.model.PolosCursos;
import br.com.tcc.projetoGraduei.repository.PolosCursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolosCursosService {
    @Autowired
    private PolosCursosRepository polosCursosRepository;
    public List<PolosCursos> listarPolosCursos(){return polosCursosRepository.findAll();}
}
