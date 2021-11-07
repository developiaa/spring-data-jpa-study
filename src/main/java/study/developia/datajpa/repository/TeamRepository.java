package study.developia.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.developia.datajpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
