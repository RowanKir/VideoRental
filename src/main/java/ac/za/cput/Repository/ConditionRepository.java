package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.Condition;

import java.util.Set;

public interface ConditionRepository extends IRepository<Condition, String>{
    Set<Condition> getAll();
}
