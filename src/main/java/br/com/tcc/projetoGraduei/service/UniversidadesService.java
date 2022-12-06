package br.com.tcc.projetoGraduei.service;

import br.com.tcc.projetoGraduei.model.Universidades;
import br.com.tcc.projetoGraduei.repository.UniversidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversidadesService {
    @Autowired
    private UniversidadesRepository universidadesRepository;

    public Universidades salvar(Universidades universidades) {
        return universidadesRepository.save(universidades);
    }

    public List<Universidades> listarUniversidades(){
        return universidadesRepository.findAll();
    }
}
