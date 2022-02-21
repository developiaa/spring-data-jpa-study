package study.developia.datajpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import study.developia.datajpa.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
