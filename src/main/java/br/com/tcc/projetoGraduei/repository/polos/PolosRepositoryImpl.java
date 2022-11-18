package br.com.tcc.projetoGraduei.repository.polos;

import br.com.tcc.projetoGraduei.dto.CidadeEstado;
import br.com.tcc.projetoGraduei.dto.PolosCidades;
import br.com.tcc.projetoGraduei.dto.PolosUniversidades;
import br.com.tcc.projetoGraduei.model.Cidades;
import br.com.tcc.projetoGraduei.model.Polos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PolosRepositoryImpl {
    @PersistenceContext
    private EntityManager manager;


    public List<PolosUniversidades> listarPoloUni(String categoria) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<PolosUniversidades> criteriaQuery = criteriaBuilder.
                createQuery(PolosUniversidades.class);

        Root<Polos> root = criteriaQuery.from(Polos.class);

        criteriaQuery.select(criteriaBuilder.construct(PolosUniversidades.class,
                root.get("id"),
                root.get("nome_polo"),
                root.get("universidades")
        ));

        criteriaQuery.where(
                criteriaBuilder.equal(root.get("universidades").get("categoria"), categoria));

        TypedQuery<PolosUniversidades> typedQuery = manager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }

    public List<PolosCidades> listarPoloCidade(String nome_cidade) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<PolosCidades> criteriaQuery = criteriaBuilder.
                createQuery(PolosCidades.class);

        Root<Polos> root = criteriaQuery.from(Polos.class);

        criteriaQuery.select(criteriaBuilder.construct(PolosCidades.class,
                root.get("id"),
                root.get("nome_polo"),
                root.get("cidades")
        ));

        criteriaQuery.where(
                criteriaBuilder.equal(root.get("cidades").get("nome_cidade"), nome_cidade));

        TypedQuery<PolosCidades> typedQuery = manager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }
}
