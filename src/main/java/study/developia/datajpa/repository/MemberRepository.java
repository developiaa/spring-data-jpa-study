package study.developia.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.developia.datajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
