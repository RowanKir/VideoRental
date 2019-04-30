package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.Account;
import ac.za.cput.Repository.AccountRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class AccountRepositoryImplTest {

    private AccountRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = AccountRepositoryImpl.getRepository();
    }

    @Test
    public void create()
    {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);

    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Account> accounts =  this.repository.getAll();
        Assert.assertEquals(1, accounts.size());
    }

}