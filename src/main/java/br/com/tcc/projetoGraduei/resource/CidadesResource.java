package br.com.tcc.projetoGraduei.resource;

import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.model.Universidades;
import br.com.tcc.projetoGraduei.repository.CidadesRepository;
import br.com.tcc.projetoGraduei.service.CidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidades")
public class CidadesResource {
    @Autowired
    private CidadesService cidadesService;

    @Autowired
    private CidadesRepository cidadesRepository;


    @CrossOrigin()
    @GetMapping("/todos")
    public List<Cidades> listarCidades(){return cidadesService.listarCidades();}

    @GetMapping("/{id}")
    public ResponseEntity<Cidades>buscarPeloId(@PathVariable Integer id){
        Optional<Cidades>cidades = cidadesRepository.findById(id);
        return cidades.isPresent() ? ResponseEntity.ok(cidades.get()) : ResponseEntity.notFound() .build();
    }

    @DeleteMapping("/{id}")
    public void remover (@PathVariable Integer id){cidadesRepository.deleteById(id);
    }
}
