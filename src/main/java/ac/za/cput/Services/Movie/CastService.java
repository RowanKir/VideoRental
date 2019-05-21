package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.MovieCast;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface CastService extends IService<MovieCast, String>
{
    Set<MovieCast> getAll();
}
