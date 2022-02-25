package study.developia.datajpa.repository;

public interface NestedClosedProjections {
    String getUsername();   //최적화 가능
    TeamInfo getTeam(); //연관관계는 조인으로 가져와 최적화 안됨(전부 가져와서 필터링)

    interface TeamInfo {
        String getName();
    }

}
