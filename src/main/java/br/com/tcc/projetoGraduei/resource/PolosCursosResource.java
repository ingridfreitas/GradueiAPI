package br.com.tcc.projetoGraduei.resource;

import br.com.tcc.projetoGraduei.model.PolosCursos;
import br.com.tcc.projetoGraduei.repository.PolosCursosRepository;
import br.com.tcc.projetoGraduei.service.PolosCursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/polosCursos")
public class PolosCursosResource {
    @Autowired
    private PolosCursosService polosCursosService;

    @Autowired
    private PolosCursosRepository polosCursosRepository;

    @GetMapping("/todos")
    public List<PolosCursos> listarPolosCursos(){return polosCursosService.listarPolosCursos();}

    @GetMapping("/{id}")
    public ResponseEntity<PolosCursos> buscarPeloId(@PathVariable Integer id){
        Optional<PolosCursos> polosCursos = polosCursosRepository.findById(id);
        return polosCursos.isPresent() ? ResponseEntity.ok(polosCursos.get()) : ResponseEntity.notFound() .build();
    }

    @DeleteMapping("/{id}")
    public void remover (@PathVariable Integer id){polosCursosRepository.deleteById(id);
    }
}
