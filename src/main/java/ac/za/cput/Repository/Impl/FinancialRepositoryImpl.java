package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.FinancialTransaction;
import ac.za.cput.Repository.FinancialRepository;

import java.util.HashSet;
import java.util.Set;

public class FinancialRepositoryImpl implements FinancialRepository {

    private static FinancialRepositoryImpl repository = null;
    private Set<FinancialTransaction> fin = new HashSet<>();

    public static FinancialRepositoryImpl getRepository()
    {
        if(repository == null) repository = new FinancialRepositoryImpl();
        return repository;
    }

    public FinancialTransaction create (FinancialTransaction fin)
    {
        this.fin.add(fin);
        return fin;
    }

    public FinancialTransaction read (String fin)
    {
        return null;
    }

    public FinancialTransaction update (FinancialTransaction fin)
    {
        return null;
    }

    public void delete(String fin)
    {

    }

    public Set<FinancialTransaction> getAll()
    {
        final Set<FinancialTransaction> fin = this.fin;
        return fin;
    }
}
