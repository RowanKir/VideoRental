package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.Actor;

import java.util.Set;

public interface ActorRepository extends IRepository<Actor, String> {
    Set<Actor> getAll();
}
