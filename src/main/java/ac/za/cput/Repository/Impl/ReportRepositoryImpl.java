package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Member.Report;
import ac.za.cput.Repository.ReportRepository;

import java.util.HashSet;
import java.util.Set;

public class ReportRepositoryImpl implements ReportRepository {

    private static ReportRepositoryImpl repository = null;
    private Set<Report>report = new HashSet<>();

    static ReportRepositoryImpl getRepository()
    {
        if(repository == null) repository = new ReportRepositoryImpl();
        return repository;
    }

    public Report create (Report report)
    {
        this.report.add(report);
        return report;
    }

    public Report read (Report report)
    {
        return null;
    }

    public Report update (Report report)
    {
        return null;
    }

    public void delete(String report)
    {

    }

    public Set<Report> getAll()
    {
        final Set<Report> report = this.report;
        return report;
    }
}
