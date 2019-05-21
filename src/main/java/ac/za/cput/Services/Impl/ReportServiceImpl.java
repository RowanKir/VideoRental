package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Member.Report;
import ac.za.cput.Repository.Impl.ReportRepositoryImpl;
import ac.za.cput.Repository.ReportRepository;
import ac.za.cput.Services.Member.ReportService;

import java.util.Set;

public class ReportServiceImpl implements ReportService {

    private static ReportServiceImpl service = null;
    private ReportRepository repository;

    private ReportServiceImpl()
    {
        this.repository = ReportRepositoryImpl.getRepository();
    }

    public static ReportServiceImpl getService(){
        if (service == null) service = new ReportServiceImpl();
        return service;
    }

    @Override
    public Report create(Report type) {
        return this.repository.create(type);
    }

    @Override
    public Report update(Report type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Report read(String s) {
        return this.repository.read(s);

    }

    @Override
    public Set<Report> getAll() {
        return this.repository.getAll();
    }
}
