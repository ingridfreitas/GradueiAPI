package br.com.tcc.projetoGraduei.repository.cursos;

import br.com.tcc.projetoGraduei.dto.CursosPolos;
import br.com.tcc.projetoGraduei.model.Polos;
import br.com.tcc.projetoGraduei.model.PolosCursos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PolosCursosRepositoryImpl implements PolosCursosRepositoryQuery{
    @PersistenceContext
    private EntityManager manager;

    public List<CursosPolos> listarPoloCurso(String nome_curso) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<CursosPolos> criteriaQuery = criteriaBuilder.
                createQuery(CursosPolos.class);

        Root<PolosCursos> root = criteriaQuery.from(PolosCursos.class);

        criteriaQuery.select(criteriaBuilder.construct(CursosPolos.class,
                root.get("id"),
                root.get("nota"),
                root.get("cursos"),
                root.get("polos")
                ));

        criteriaQuery.where(
                criteriaBuilder.equal(root.get("cursos").get("nome_curso"), nome_curso));

        TypedQuery<CursosPolos> typedQuery = manager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }

    public List<CursosPolos> listarCursoPolo(String nome_polo) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<CursosPolos> criteriaQuery = criteriaBuilder.
                createQuery(CursosPolos.class);

        Root<PolosCursos> root = criteriaQuery.from(PolosCursos.class);

        criteriaQuery.select(criteriaBuilder.construct(CursosPolos.class,
                root.get("id"),
                root.get("nota"),
                root.get("cursos"),
                root.get("polos")
        ));

        criteriaQuery.where(
                criteriaBuilder.equal(root.get("polos").get("nome_polo"), nome_polo));

        TypedQuery<CursosPolos> typedQuery = manager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }

}
