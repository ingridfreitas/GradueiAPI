package br.com.tcc.projetoGraduei.service;

import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.repository.CidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadesService {
    @Autowired
    private CidadesRepository cidadesRepository;
    public List<Cidades> listarCidades(){return cidadesRepository.findAll();}
}
