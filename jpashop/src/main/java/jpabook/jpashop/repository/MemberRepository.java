package jpabook.jpashop.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Has methods to deal with database
@RequiredArgsConstructor
public class MemberRepository {

//    @PersistenceContext // Inject beans created by @SpringBootApplication to EntityManager.
//    Can be used with @Autowired supported by SpringBoot.
    private  final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) {
        return em.find(Member.class, id); // Find one entity by primary key.
    }

    public List<Member> findAll() {
        return em.createQuery("SELECT m FROM Member m", Member.class) // Find all entities of Member
                .getResultList(); // SQL <-> JPQL : JPQL queries for entities, not DB table
    }

    public List<Member> findByName(String name) {
        return em.createQuery("SELECT m FROM Member m WHERE m.name = :name", Member.class)
                .setParameter("name", name) // parameter binding
                .getResultList();
    }
}
