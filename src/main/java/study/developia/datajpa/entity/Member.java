package study.developia.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {


    @Id
    @GeneratedValue
    private Long id;

    private String username;

    // jpa에서 entity에 최소 기본 생성자 하나가 있어야 함(spec에 명시됨)
    protected Member() {
    }

    public Member(String username) {
        this.username = username;
    }
}
