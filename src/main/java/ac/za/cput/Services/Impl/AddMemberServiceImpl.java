package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Customer.AddMember;
import ac.za.cput.Repository.AddRepository;
import ac.za.cput.Repository.Impl.AddRepositoryImpl;
import ac.za.cput.Services.Customer.AddMemberService;

import java.util.Set;

public class AddMemberServiceImpl implements AddMemberService {

    private static AddMemberServiceImpl service = null;
    private AddRepository repository;

    private AddMemberServiceImpl()
    {
        this.repository = AddRepositoryImpl.getRepository();
    }

    public static AddMemberServiceImpl getService(){
        if (service == null) service = new AddMemberServiceImpl();
        return service;
    }

    @Override
    public AddMember create(AddMember type) {
        return this.repository.create(type);

    }

    @Override
    public AddMember update(AddMember type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public AddMember read(String s) {
        return this.repository.read(s);

    }

    @Override
    public Set<AddMember> getAll() {
        return this.repository.getAll();
    }
}
