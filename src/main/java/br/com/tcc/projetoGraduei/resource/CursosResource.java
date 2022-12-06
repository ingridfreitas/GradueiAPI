package br.com.tcc.projetoGraduei.resource;


import br.com.tcc.projetoGraduei.model.Cursos;
import br.com.tcc.projetoGraduei.repository.CursosRepository;
import br.com.tcc.projetoGraduei.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursosResource {
    @Autowired
    private CursoService cursoService;

    @Autowired
    private CursosRepository cursoRepository;

    @CrossOrigin()
    @GetMapping("/todos")
    public List<Cursos> listarCursos(){return cursoService.listarCursos();
    }

    @CrossOrigin()
    @GetMapping("/{id}")
    public ResponseEntity<Cursos> buscarPeloId(@PathVariable Integer id){
        Optional<Cursos> cursos = cursoRepository.findById(id);
        return cursos.isPresent() ? ResponseEntity.ok(cursos.get()) : ResponseEntity.notFound() .build();
    }
    @CrossOrigin()
    @DeleteMapping("/{id}")
    public void remover (@PathVariable Integer id){
        cursoRepository.deleteById(id);
    }

    @CrossOrigin
    @PostMapping()
    public ResponseEntity<Cursos> criar(@RequestBody Cursos curso, HttpServletResponse response){
        Cursos cursoSalvo = cursoService.salvar(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoSalvo);
    }
}
