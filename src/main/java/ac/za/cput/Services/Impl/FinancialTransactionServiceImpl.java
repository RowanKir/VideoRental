package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Account.FinancialTransaction;
import ac.za.cput.Repository.FinancialRepository;
import ac.za.cput.Repository.Impl.FinancialRepositoryImpl;
import ac.za.cput.Services.Account.FinancialTransactionService;

import java.util.Set;

public class FinancialTransactionServiceImpl implements FinancialTransactionService {

    private static FinancialTransactionServiceImpl service = null;
    private FinancialRepository repository;

    private FinancialTransactionServiceImpl()
    {
        this.repository = FinancialRepositoryImpl.getRepository();
    }

    public static FinancialTransactionServiceImpl getService(){
        if (service == null) service = new FinancialTransactionServiceImpl();
        return service;
    }

    @Override
    public FinancialTransaction create(FinancialTransaction type) {
        return this.repository.create(type);
    }

    @Override
    public FinancialTransaction update(FinancialTransaction type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public FinancialTransaction read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<FinancialTransaction> getAll() {
        return this.repository.getAll();
    }
}
