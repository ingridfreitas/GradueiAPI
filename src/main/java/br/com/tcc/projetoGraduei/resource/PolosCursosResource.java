package br.com.tcc.projetoGraduei.resource;

import br.com.tcc.projetoGraduei.dto.CursosPolos;
import br.com.tcc.projetoGraduei.dto.PolosCidades;
import br.com.tcc.projetoGraduei.model.PolosCursos;
import br.com.tcc.projetoGraduei.repository.PolosCursosRepository;
import br.com.tcc.projetoGraduei.service.PolosCursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/polosCursos")
public class PolosCursosResource {
    @Autowired
    private PolosCursosService polosCursosService;

    @Autowired
    private PolosCursosRepository polosCursosRepository;
    @CrossOrigin()
    @GetMapping("/todos")
    public List<PolosCursos> listarPolosCursos(){return polosCursosService.listarPolosCursos();}

    @GetMapping("/{id}")
    public ResponseEntity<PolosCursos> buscarPeloId(@PathVariable Integer id){
        Optional<PolosCursos> polosCursos = polosCursosRepository.findById(id);
        return polosCursos.isPresent() ? ResponseEntity.ok(polosCursos.get()) : ResponseEntity.notFound() .build();
    }

    @CrossOrigin()
    @DeleteMapping("/{id}")
    public void remover (@PathVariable Integer id){polosCursosRepository.deleteById(id);
    }

    @CrossOrigin
    @GetMapping("/cursos")
    public List<CursosPolos> buscarPoloCurso(@RequestParam String nome_curso) {

        return polosCursosRepository.listarPoloCurso(nome_curso);
    }

    @CrossOrigin
    @GetMapping("/polos")
    public List<CursosPolos> buscarCursoPolo(@RequestParam String nome_polo) {

        return polosCursosRepository.listarCursoPolo(nome_polo);
    }

    @CrossOrigin
    @PostMapping()
    public ResponseEntity<PolosCursos> criar(@RequestBody PolosCursos polosCursos, HttpServletResponse response){
        PolosCursos pocurSalvo = polosCursosService.salvar(polosCursos);
        return ResponseEntity.status(HttpStatus.CREATED).body(pocurSalvo);
    }
}
