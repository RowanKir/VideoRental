package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.Account;
import ac.za.cput.Repository.AccountRepository;

import java.util.HashSet;
import java.util.Set;

public class AccountRepositoryImpl implements AccountRepository {

    private static AccountRepositoryImpl repository = null;
    private Set<Account> account = new HashSet<>();

    static AccountRepository getRepository()
    {
        if(repository == null) repository = new AccountRepositoryImpl();

            return repository;

    }

    public Account create (Account account)
    {
        this.account.add(account);
        return account;
    }

    public Account read(Account account) {
        //find the student in the set and return it if it exist
        return null;
    }

    public Account update (Account account)
    {
        //find the student, update it and return the updated student
        return null;
    }

    public void delete(String account)
    {
        //find the student and delete it if it exists
    }

    public Set<Account> getAll()
    {
        final Set<Account> account = this.account;
        return account;
    }
}
