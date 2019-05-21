package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.Genre;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface GenreService extends IService<Genre, String>
{
    Set<Genre> getAll();
}
