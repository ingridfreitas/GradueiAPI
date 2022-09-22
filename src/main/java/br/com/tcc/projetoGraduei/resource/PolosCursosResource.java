package br.com.tcc.projetoGraduei.resource;

import br.com.tcc.projetoGraduei.model.PolosCursos;
import br.com.tcc.projetoGraduei.repository.PolosCursosRepository;
import br.com.tcc.projetoGraduei.service.PolosCursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/poloscursos")
public class PolosCursosResource {
    @Autowired
    private PolosCursosService polosCursosService;

    @Autowired
    private PolosCursosRepository polosCursosRepository;

    @GetMapping("/todos")
    public List<PolosCursos> listarPolosCursos(){return polosCursosService.listarPolosCursos();}
}
