package ac.za.cput.Services.Movie;

import ac.za.cput.Domain.Movie.Status;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface StatusService extends IService<Status, String>
{
    Set<Status> getAll();
}
