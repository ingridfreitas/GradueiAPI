package br.com.tcc.projetoGraduei.repository.cidade;

import br.com.tcc.projetoGraduei.dto.CidadeEstado;
import br.com.tcc.projetoGraduei.model.Cidades;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CidadesRepositoryImpl implements CidadesRepositoryQuery {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<CidadeEstado> listarCidadeEstado(String nome_estado) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<CidadeEstado> criteriaQuery = criteriaBuilder.
                createQuery(CidadeEstado.class);

        Root<Cidades> root = criteriaQuery.from(Cidades.class);

        criteriaQuery.select(criteriaBuilder.construct(CidadeEstado.class,
                root.get("id"),
                root.get("nome_cidade"),
                root.get("estado")
        ));

        criteriaQuery.where(
                criteriaBuilder.equal(root.get("estado").get("nome_estado"), nome_estado));

        TypedQuery<CidadeEstado> typedQuery = manager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }
}
