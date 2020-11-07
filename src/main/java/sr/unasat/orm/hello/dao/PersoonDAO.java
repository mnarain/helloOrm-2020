package sr.unasat.orm.hello.dao;

import sr.unasat.orm.hello.entities.Persoon;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class PersoonDAO {
    private EntityManager entityManager;

    public PersoonDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Persoon> retrievePersoonList() {
        entityManager.getTransaction().begin();

/*        String sql = "select * from Persoon";
        Query query = entityManager.createNativeQuery(sql);
        List<Persoon> persoonList = query.getResultList();*/

        String jpql = "select s from Persoon s";
        TypedQuery<Persoon> query = entityManager.createQuery(jpql, Persoon.class);
        List<Persoon> persoonList = query.getResultList();

        entityManager.getTransaction().commit();
        return persoonList;
    }

}
