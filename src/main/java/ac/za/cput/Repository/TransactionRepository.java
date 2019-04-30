package ac.za.cput.Repository;

import ac.za.cput.Domain.Account.TransactionType;

import java.util.Set;

public interface TransactionRepository extends IRepository<TransactionType, String>{
    Set<TransactionType> getAll();
}
