package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Account.TransactionType;
import ac.za.cput.Repository.Impl.TransactionRepositoryImpl;
import ac.za.cput.Repository.TransactionRepository;
import ac.za.cput.Services.Account.TransactionService;

import java.util.Set;

public class TransactionServiceImpl implements TransactionService {

    private static TransactionServiceImpl service = null;
    private TransactionRepository repository;

    private TransactionServiceImpl()
    {
        this.repository = TransactionRepositoryImpl.getRepository();
    }

    public static TransactionServiceImpl getService(){
        if (service == null) service = new TransactionServiceImpl();
        return service;
    }


    @Override
    public TransactionType create(TransactionType type) {
        return this.repository.create(type);

    }

    @Override
    public TransactionType update(TransactionType type) {
        return this.repository.update(type);

    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public TransactionType read(String s) {
        return this.repository.read(s);

    }

    @Override
    public Set<TransactionType> getAll() {
        return this.repository.getAll();

    }
}
