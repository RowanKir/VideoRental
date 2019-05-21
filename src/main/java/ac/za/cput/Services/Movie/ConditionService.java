package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.Condition;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface ConditionService extends IService<Condition, String>
{
    Set<Condition> getAll();
}
