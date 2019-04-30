package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.FormatType;

import java.util.Set;

public interface FormatRepository extends IRepository<FormatType, String> {
    Set<FormatType> getAll();
}
