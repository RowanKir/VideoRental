package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.Account;
import ac.za.cput.Factory.Account.AccountFactory;
import ac.za.cput.Repository.AccountRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class AccountRepositoryImplTest {

    private AccountRepository repository;
    private Account account;

    private Account getSavedAccount()
    {
        Set<Account> savedAccount = this.repository.getAll();
        return savedAccount.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = AccountRepositoryImpl.getRepository();
        this.account = AccountFactory.buildAccount("1", 1, "Premium", "Kirchner", "Owner");
    }

    @Test
    public void a_create()
    {
        Account created = this.repository.create(this.account);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.account);

    }

    @Test
    public void b_read()
    {
        Account savedAccount = getSavedAccount();
        System.out.println("In read, courseId = "+ savedAccount.getAccountId());
        Account read = this.repository.read(savedAccount.getAccountId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedAccount, read);
    }

    @Test
    public void c_update()
    {
        String newname = "New Test Course Name";
        Account account = new Account.Builder().copy(getSavedAccount()).accountName(newname).build();
        System.out.println("In update, about_to_updated = " + account);
        Account updated = this.repository.update(account);
        System.out.println("In update, updated = " + updated);
        assertSame(newname, updated.getAccountName());
        d_getAll();
    }

    @Test
    public void e_delete()
    {
        Account savedAccount = getSavedAccount();
        this.repository.delete(savedAccount.getAccountId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Account> accounts =  this.repository.getAll();
        System.out.println("In getAll, all = " + accounts);

        //Assert.assertEquals(1, accounts.size());
    }

}