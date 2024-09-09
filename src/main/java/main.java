import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Pagamento;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("pagamentosPU");
        EntityManager entityManager = entityManagerFactory.
                createEntityManager();
        entityManager.getTransaction().begin();
        Pagamento pg = new Pagamento();
        pg.setValor(500);
        pg.setData(new Date());
        System.out.println(pg);
        entityManager.persist(pg);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        entityManager.close();
    }
}