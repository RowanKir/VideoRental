package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Customer.NonMember;
import ac.za.cput.Repository.NonMemberRepository;

import java.util.HashSet;
import java.util.Set;

public class NonMemberRepositoryImpl implements NonMemberRepository {

    private static NonMemberRepositoryImpl repository = null;
    private Set<NonMember> non = new HashSet<>();

    public static NonMemberRepositoryImpl getRepository()
    {
        if(repository == null) repository = new NonMemberRepositoryImpl();
        return repository;
    }

    public NonMember create (NonMember non)
    {
        this.non.add(non);
        return non;
    }

    public NonMember read (String non)
    {
        return null;
    }

    public NonMember update (NonMember non)
    {
        return null;
    }

    public void delete(String non)
    {

    }

    public Set<NonMember> getAll()
    {
        final Set<NonMember> non = this.non;
        return non;
    }
}
