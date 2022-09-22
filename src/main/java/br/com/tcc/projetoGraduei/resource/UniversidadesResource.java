package br.com.tcc.projetoGraduei.resource;

import br.com.tcc.projetoGraduei.model.Universidades;
import br.com.tcc.projetoGraduei.repository.UniversidadesRepository;
import br.com.tcc.projetoGraduei.service.UniversidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/universidades")
public class UniversidadesResource {
    @Autowired
    private UniversidadesService universidadesService;
    @Autowired
    private UniversidadesRepository universidadesRepository;

    @GetMapping("/todos")
    public List<Universidades> listarUniversidades(){return universidadesService.listarUniversidades();}

    @GetMapping("/{id}")
    public ResponseEntity<Universidades> buscarPeloId(@PathVariable Integer id){
        Optional<Universidades> universidades = universidadesRepository.findById(id);
        return universidades.isPresent() ? ResponseEntity.ok(universidades.get()) : ResponseEntity.notFound() .build();
    }
    @DeleteMapping("/{id}")
    public void remover (@PathVariable Integer id){
        universidadesRepository.deleteById(id);
    }

}
