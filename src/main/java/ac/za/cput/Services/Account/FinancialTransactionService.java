package ac.za.cput.Services.Account;

import ac.za.cput.Domain.Account.FinancialTransaction;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface FinancialTransactionService extends IService <FinancialTransaction, String> {
    Set<FinancialTransaction> getAll();
}
