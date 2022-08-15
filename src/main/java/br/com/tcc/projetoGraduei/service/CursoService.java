package br.com.tcc.projetoGraduei.service;
import br.com.tcc.projetoGraduei.model.Cursos;
import br.com.tcc.projetoGraduei.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    public List<Cursos> listarCursos(){
        return cursoRepository.findAll();
    }
}
