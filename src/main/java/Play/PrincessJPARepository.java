package Play;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/18 10:34
 */
@Repository
@Transactional
public class PrincessJPARepository  {
//    @PersistenceUnit
    @PersistenceContext
    private EntityManager em;

    public void addGirl(Princess princess) {
        em.persist(princess);
    }
}
