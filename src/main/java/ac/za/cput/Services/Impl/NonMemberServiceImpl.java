package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Customer.NonMember;
import ac.za.cput.Repository.Impl.NonMemberRepositoryImpl;
import ac.za.cput.Repository.NonMemberRepository;
import ac.za.cput.Services.Customer.NonMemberService;

import java.util.Set;

public class NonMemberServiceImpl implements NonMemberService {

    private static NonMemberServiceImpl service = null;
    private NonMemberRepository repository;

    private NonMemberServiceImpl()
    {
        this.repository = NonMemberRepositoryImpl.getRepository();
    }

    public static NonMemberServiceImpl getService(){
        if (service == null) service = new NonMemberServiceImpl();
        return service;
    }

    @Override
    public NonMember create(NonMember type) {
        return this.repository.create(type);
    }

    @Override
    public NonMember update(NonMember type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public NonMember read(String s) {
        return this.repository.read(s);

    }

    @Override
    public Set<NonMember> getAll() {
        return this.repository.getAll();
    }
}
