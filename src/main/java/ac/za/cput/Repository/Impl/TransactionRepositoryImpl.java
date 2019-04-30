package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.TransactionType;
import ac.za.cput.Repository.TransactionRepository;

import java.util.HashSet;
import java.util.Set;

public class TransactionRepositoryImpl implements TransactionRepository {

    private static TransactionRepositoryImpl repository = null;
    private Set<TransactionType> transaction = new HashSet<>();

    static TransactionRepositoryImpl getRepository()
    {
        if(repository == null) repository = new TransactionRepositoryImpl();
        return repository;
    }

    public TransactionType create (TransactionType transaction)
    {
        this.transaction.add(transaction);
        return transaction;
    }

    public TransactionType read (TransactionType transaction)
    {
        return null;
    }

    public TransactionType update (TransactionType transaction)
    {
        return null;
    }

    public void delete(String transaction)
    {

    }

    public Set<TransactionType> getAll()
    {
        final Set<TransactionType> transaction = this.transaction;
        return transaction;
    }
}
