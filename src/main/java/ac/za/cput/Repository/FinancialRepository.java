package ac.za.cput.Repository;

import ac.za.cput.Domain.Account.FinancialTransaction;

import java.util.Set;

public interface FinancialRepository extends IRepository<FinancialTransaction, String>{
    Set<FinancialTransaction> getAll();
}
