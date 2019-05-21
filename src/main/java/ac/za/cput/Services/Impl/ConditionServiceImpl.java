package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Condition;
import ac.za.cput.Repository.ConditionRepository;
import ac.za.cput.Repository.Impl.ConditionRepositoryImpl;
import ac.za.cput.Services.Movie.ConditionService;

import java.util.Set;

public class ConditionServiceImpl implements ConditionService {

    private static ConditionServiceImpl service = null;
    private ConditionRepository repository;

    private ConditionServiceImpl()
    {
        this.repository = ConditionRepositoryImpl.getRepository();
    }

    public static ConditionServiceImpl getService(){
        if (service == null) service = new ConditionServiceImpl();
        return service;
    }

    @Override
    public Condition create(Condition type) {
        return this.repository.create(type);
    }

    @Override
    public Condition update(Condition type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Condition read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Condition> getAll() {
        return this.repository.getAll();    }
}
