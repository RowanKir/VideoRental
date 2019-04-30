package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.FinancialTransactions;
import ac.za.cput.Repository.FinancialRepository;

import java.util.HashSet;
import java.util.Set;

public class FinancialRepositoryImpl implements FinancialRepository {

    private static FinancialRepositoryImpl repository = null;
    private Set<FinancialTransactions> fin = new HashSet<>();

    static FinancialRepositoryImpl getRepository()
    {
        if(repository == null) repository = new FinancialRepositoryImpl();
        return repository;
    }

    public FinancialTransactions create (FinancialTransactions fin)
    {
        this.fin.add(fin);
        return fin;
    }

    public FinancialTransactions read (FinancialTransactions fin)
    {
        return null;
    }

    public FinancialTransactions update (FinancialTransactions fin)
    {
        return null;
    }

    public void delete(String fin)
    {

    }

    public Set<FinancialTransactions> getAll()
    {
        final Set<FinancialTransactions> fin = this.fin;
        return fin;
    }
}
