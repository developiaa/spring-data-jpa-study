package study.developia.datajpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
// jpa에서 entity에 최소 기본 생성자 하나가 있어야 함(spec에 명시됨)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 객체 출력시 출력됨 (연관관계가 있는 team은 하면 안됨)
@ToString(of = {"id", "username", "age"})
//@NamedQuery(
//        name = "Member.findByUsername",
//        query = "select m from Member m where m.username =:username"
//)
public class Member {


    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;


    public Member(String username) {
        this.username = username;
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Member(String username, int age, Team team) {
        this.username = username;
        this.age = age;
        if (team != null) {
            changeTeam(team);
        }
    }

    public void changeTeam(Team team) {
        this.team = team;
        team.getMember().add(this);
    }
}
