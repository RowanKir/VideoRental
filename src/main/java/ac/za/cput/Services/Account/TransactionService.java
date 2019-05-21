package ac.za.cput.Services.Account;

import ac.za.cput.Domain.Account.TransactionType;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface TransactionService extends IService <TransactionType, String>
{
    Set<TransactionType> getAll();
}
