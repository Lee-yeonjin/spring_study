package spring_study.hello_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_study.hello_spring.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
