package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Condition;
import ac.za.cput.Repository.ConditionRepository;

import java.util.HashSet;
import java.util.Set;

public class ConditionRepositoryImpl implements ConditionRepository {

    private static ConditionRepositoryImpl repository = null;
    private Set<Condition> condition = new HashSet<>();

    static ConditionRepositoryImpl getRepository()
    {
        if(repository == null) repository = new ConditionRepositoryImpl();
        return repository;
    }

    public Condition create (Condition condition)
    {
        this.condition.add(condition);
        return condition;
    }

    public Condition read (String condition)
    {
        return null;
    }

    public Condition update (Condition condition)
    {
        return null;
    }

    public void delete(String condition)
    {

    }

    public Set<Condition> getAll()
    {
        final Set<Condition> condition = this.condition;
        return condition;
    }
}
