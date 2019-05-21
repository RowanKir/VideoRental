package ac.za.cput.Services.Member;

import ac.za.cput.Domain.Member.Report;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface ReportService extends IService<Report, String>
{
    Set<Report> getAll();
}
