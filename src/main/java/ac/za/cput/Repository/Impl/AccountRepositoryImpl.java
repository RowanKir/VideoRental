package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.Account;
import ac.za.cput.Repository.AccountRepository;

import java.util.HashSet;
import java.util.Set;

public class AccountRepositoryImpl implements AccountRepository {

    private static AccountRepositoryImpl accountRepositoryImpl = null;
    private Set<Account> accounts;

    private AccountRepositoryImpl(){
        this.accounts = new HashSet<>();
    }



    @Override
    public Set<Account> getAll() {
        return null;
    }

    @Override
    public Account create(Account account) {
        return null;
    }

    @Override
    public Account update(Account account) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Account read(String t) {
        return null;
    }

    /*private Account findAccount(final String accountId){
        return this.accounts.stream()
                .filter(account -> account.getAccountId().trim().equals(accountId))
                .findAny()
                .orElse(null);
    }

    public static AccountRepositoryImpl getAccountRepositoryImpl(){
        if(accountRepositoryImpl == null)
            accountRepositoryImpl = new AccountRepositoryImpl();
            return accountRepositoryImpl;
    }

    public Account createAccount(Account account){
        this.accounts.add(account);
        return account;
    }

    public Account readAccount(final String accountId){
        Account account = findAccount(accountId);
        return account;
    }

    public void deleteAccount(String accountID){
        Account account = findAccount(accountID);
        if(account != null) this.accounts.remove(account);
    }

    public Account updateAccount(Account account){
        Account toDelete = findAccount(account.getAccountId());
        if(toDelete != null){
            this.accounts.remove(toDelete);
            return create(account);
        }
        return null;
    }

    public Set<Account> getAllAccounts(){
        return this.accounts;
    }*/
    /*private Account findAccount(final String accountId)
    {
        return this.account.stream()
                .filter(account -> account.getAccountId().trim().equals(accountId))
                .findAny()
                .orElse(null);
    }

    public static AccountRepositoryImpl getRepository()
    {
        if(accountRepositoryImpl == null)
            accountRepositoryImpl = new AccountRepositoryImpl();

            return accountRepositoryImpl;

    }

    public Account create (Account account)
    {

        this.account.add(account);
        return account;
    }

    public Account read(final String account) {

        for (Account account1 : account)
            if (account.getAccountId().equals(id)) {
                account.remove(i);
            }
        return this.account.get(account);
        Account account = getAll(ac);
        return null;
    }

    public Account update (Account accountId)
    {
        //return (Account) this.account;
        Account toDelete = getAccount(accountId.getAccountId());
        if(toDelete != null)
        {
            this.account.remove(toDelete);
            return create(accountId);
        }
    }

    private Account getAccount(final String accountId) {
        if(account.contains()){}for(){if(){}}
    }

    public void delete(String account)
    {
        this.account.remove(account);
    }

    public Set<Account> getAll()
    {
        final Set<Account> account = this.account;
        return account;
    }*/
}
