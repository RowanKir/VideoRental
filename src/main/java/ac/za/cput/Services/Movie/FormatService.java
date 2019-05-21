package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.FormatType;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface FormatService extends IService<FormatType, String>
{
    Set<FormatType> getAll();
}
