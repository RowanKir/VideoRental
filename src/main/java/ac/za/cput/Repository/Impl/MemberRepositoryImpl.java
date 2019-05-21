package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Member.Member;
import ac.za.cput.Repository.MemberRepository;

import java.util.HashSet;
import java.util.Set;

public class MemberRepositoryImpl implements MemberRepository {

    private static MemberRepositoryImpl repository = null;
    private Set<Member>member = new HashSet<>();

    public static MemberRepositoryImpl getRepository()
    {
        if(repository == null) repository = new MemberRepositoryImpl();
        return repository;
    }

    public Member create (Member member)
    {
        this.member.add(member);
        return member;
    }

    public Member read (String member)
    {
        return null;
    }

    public Member update (Member member)
    {
        return null;
    }

    public void delete(String member)
    {

    }

    public Set<Member> getAll()
    {
        final Set<Member> member = this.member;
        return member;
    }
}
