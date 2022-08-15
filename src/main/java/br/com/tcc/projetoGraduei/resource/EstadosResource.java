package br.com.tcc.projetoGraduei.resource;

import br.com.tcc.projetoGraduei.model.Estados;
import br.com.tcc.projetoGraduei.repository.EstadosRepository;
import br.com.tcc.projetoGraduei.service.EstadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estados")
public class EstadosResource {
    @Autowired
    private EstadosService estadosService;

    @Autowired
    private EstadosRepository estadosRepository;

    @GetMapping("/todos")
    public List<Estados> listarEstados(){
        return estadosService.listarEstados();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estados> buscarPeloId(@PathVariable Integer id){
        Optional<Estados>estados = estadosRepository.findById(id);
        return estados.isPresent() ? ResponseEntity.ok(estados.get()) : ResponseEntity.notFound() .build();
    }

    @DeleteMapping("/{id}")
    public void remover (@PathVariable Integer id){
        estadosRepository.deleteById(id);
    }
}
