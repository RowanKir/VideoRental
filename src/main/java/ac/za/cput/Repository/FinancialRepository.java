package ac.za.cput.Repository;

import ac.za.cput.Domain.Account.FinancialTransactions;

import java.util.Set;

public interface FinancialRepository extends IRepository<FinancialTransactions, String>{
    Set<FinancialTransactions> getAll();
}
