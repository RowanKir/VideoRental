package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Account.Account;
import ac.za.cput.Repository.AccountRepository;
import ac.za.cput.Repository.Impl.AccountRepositoryImpl;
import ac.za.cput.Services.Account.AccountService;

import java.util.Set;

public class AccountServiceImpl implements AccountService {

    private static AccountServiceImpl service = null;
    private AccountRepository repository;

    private AccountServiceImpl()
    {
        this.repository = AccountRepositoryImpl.getRepository();
    }

    public static AccountServiceImpl getService(){
        if (service == null) service = new AccountServiceImpl();
        return service;
    }
    @Override
    public Account create(Account type) {
        return this.repository.create(type);
    }

    @Override
    public Account update(Account type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Account read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Account> getAll() {
        return this.repository.getAll();
    }
}
