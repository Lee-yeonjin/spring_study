package spring_study.hello_spring.repository;

import spring_study.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> fidnByName(String name);
    List<Member> findAll();
}
