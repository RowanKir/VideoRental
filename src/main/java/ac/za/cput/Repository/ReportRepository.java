package ac.za.cput.Repository;

import ac.za.cput.Domain.Account.Account;
import ac.za.cput.Domain.Member.Report;

import java.util.Set;

public interface ReportRepository extends IRepository<Report, String>{
    Set<Report> getAll();
}
