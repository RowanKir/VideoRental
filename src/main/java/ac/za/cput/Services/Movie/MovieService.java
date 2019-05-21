package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface MovieService extends IService<Movie, String>
{
    Set<Movie> getAll();
}
