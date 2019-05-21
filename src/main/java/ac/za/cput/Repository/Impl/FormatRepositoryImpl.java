package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.FormatType;
import ac.za.cput.Repository.FormatRepository;

import java.util.HashSet;
import java.util.Set;

public class FormatRepositoryImpl implements FormatRepository {

    private static FormatRepositoryImpl repository = null;
    private Set<FormatType> format = new HashSet<>();

    public static FormatRepositoryImpl getRepository()
    {
        if(repository == null) repository = new FormatRepositoryImpl();
        return repository;
    }

    public FormatType create (FormatType format)
    {
        this.format.add(format);
        return format;
    }

    public FormatType read (String format)
    {
        return null;
    }

    public FormatType update (FormatType format)
    {
        return null;
    }

    public void delete(String format)
    {

    }

    public Set<FormatType> getAll()
    {
        final Set<FormatType> format = this.format;
        return format;
    }
}
