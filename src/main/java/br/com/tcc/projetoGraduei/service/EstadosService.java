package br.com.tcc.projetoGraduei.service;

import br.com.tcc.projetoGraduei.model.Estados;
import br.com.tcc.projetoGraduei.repository.EstadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EstadosService {
    @Autowired
    private EstadosRepository estadosRepository;
    public List<Estados> listarEstados(){
        return estadosRepository.findAll();
    }
}
