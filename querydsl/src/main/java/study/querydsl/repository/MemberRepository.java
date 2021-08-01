package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> { //custom이후는 별로 실무에서는 쓰기 어려운 것들.
    //select m from Member m where m.username = ? 똭 실행
    List<Member> findByUsername(String username);


}
