package br.com.tcc.projetoGraduei.resource;

import br.com.tcc.projetoGraduei.dto.CidadeEstado;
import br.com.tcc.projetoGraduei.dto.PolosCidades;
import br.com.tcc.projetoGraduei.dto.PolosUniversidades;
import br.com.tcc.projetoGraduei.model.Estados;
import br.com.tcc.projetoGraduei.model.Polos;
import br.com.tcc.projetoGraduei.repository.PolosRepository;
import br.com.tcc.projetoGraduei.service.PolosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/polos")
public class PolosResource {
    @Autowired
    private PolosRepository polosRepository;

    @Autowired
    private PolosService polosService;

    @CrossOrigin()
    @GetMapping("/todos")
    public List<Polos> listarPolos(){return polosService.listarPolos();}

    @GetMapping("/{id}")
    public ResponseEntity<Polos> buscarPeloId(@PathVariable Integer id){
        Optional<Polos> polos = polosRepository.findById(id);
        return polos.isPresent() ? ResponseEntity.ok(polos.get()) : ResponseEntity.notFound() .build();
    }

    @DeleteMapping("/{id}")
    public void remover (@PathVariable Integer id){polosRepository.deleteById(id);
    }

    @CrossOrigin()
    @GetMapping("/universidades")
    public List<PolosUniversidades> buscaPoloUni(@RequestParam String categoria){
        return polosRepository.listarPoloUni(categoria);
    }

    @CrossOrigin()
    @GetMapping("/cidades")
    public List<PolosCidades> buscarPoloCidade(@RequestParam String nome_cidade) {

        return polosRepository.listarPoloCidade(nome_cidade);
    }
}
