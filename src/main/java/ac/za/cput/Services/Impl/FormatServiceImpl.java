package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.FormatType;
import ac.za.cput.Repository.FormatRepository;
import ac.za.cput.Repository.Impl.FormatRepositoryImpl;
import ac.za.cput.Services.Movie.FormatService;

import java.util.Set;

public class FormatServiceImpl implements FormatService {

    private static FormatServiceImpl service = null;
    private FormatRepository repository;

    private FormatServiceImpl()
    {
        this.repository = FormatRepositoryImpl.getRepository();
    }

    public static FormatServiceImpl getService(){
        if (service == null) service = new FormatServiceImpl();
        return service;
    }



    @Override
    public FormatType create(FormatType type) {
        return this.repository.create(type);
    }

    @Override
    public FormatType update(FormatType type) {
        return this.repository.update(type);

    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public FormatType read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<FormatType> getAll() {
        return this.repository.getAll();

    }


}
