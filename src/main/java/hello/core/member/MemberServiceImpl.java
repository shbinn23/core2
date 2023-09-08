package hello.core.member;

public class MemberServiceImpl implements MemberService{

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;    // 추상화에만 의존 (오직 인터페이스), 구체적인건 AppConfig 에서 객체 인스턴스의 참조값이 변수에 저장된

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findId(memberId);
    }
}
