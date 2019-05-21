package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Member.Member;
import ac.za.cput.Repository.Impl.MemberRepositoryImpl;
import ac.za.cput.Repository.MemberRepository;
import ac.za.cput.Services.Member.MemberService;

import java.util.Set;

public class MemberServiceImpl implements MemberService {

    private static MemberServiceImpl service = null;
    private MemberRepository repository;

    private MemberServiceImpl()
    {
        this.repository = MemberRepositoryImpl.getRepository();
    }

    public static MemberServiceImpl getService(){
        if (service == null) service = new MemberServiceImpl();
        return service;
    }

    @Override
    public Member create(Member type) {
        return this.repository.create(type);

    }

    @Override
    public Member update(Member type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Member read(String s) {
        return this.repository.read(s);    }

    @Override
    public Set<Member> getAll() {
        return this.repository.getAll();

    }
}
