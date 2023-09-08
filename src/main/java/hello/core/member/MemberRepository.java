package hello.core.member;

public interface MemberRepository {

    void save(Member member);   // Member 클래스 타입의 객체를 매개변수로 받아 '저장'기능을 담당
    Member findId(Long memberId);
}
