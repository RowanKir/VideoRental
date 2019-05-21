package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Customer.AddMember;
import ac.za.cput.Repository.AddRepository;

import java.util.HashSet;
import java.util.Set;

public class AddRepositoryImpl implements AddRepository {

    private static AddRepositoryImpl repository = null;
    private Set<AddMember> addMember = new HashSet<>();

    public static AddRepository getRepository()
    {
        if(repository == null) repository = new AddRepositoryImpl();
        return repository;
    }

    public AddMember create (AddMember addMember)
    {
        this.addMember.add(addMember);
        return addMember;
    }

    public AddMember read (String addMember)
    {
        //find the addMember in the set and return it if it exist
        return null;
    }

    public AddMember update (AddMember addMember)
    {
        //find the addMember, update it and return the updated student
        return null;
    }

    public void delete (String addMember)
    {
        //find the addMember and delete it if it exists
    }

    public Set<AddMember> getAll()
    {
        final Set<AddMember> addMembers = this.addMember;
        return addMembers;
    }

}
