package sr.unasat.orm.hello.app;

import sr.unasat.orm.hello.config.JPAConfiguration;
import sr.unasat.orm.hello.dao.PersoonDAO;
import sr.unasat.orm.hello.entities.Persoon;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        PersoonDAO persoonDAO = new PersoonDAO(JPAConfiguration.getEntityManager());
        List<Persoon> persoonList = persoonDAO.retrievePersoonList();
        persoonList.stream().forEach(System.out::println);
        JPAConfiguration.shutdown();
    }
}
