package study.developia.datajpa.entity.admin;

import study.developia.datajpa.entity.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

}
