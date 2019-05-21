package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.Actor;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface ActorService extends IService<Actor, String>
{
    Set<Actor> getAll();
}
