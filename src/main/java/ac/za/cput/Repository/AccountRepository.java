package ac.za.cput.Repository;

import ac.za.cput.Domain.Account.Account;

import java.util.HashSet;
import java.util.Set;

public interface AccountRepository extends IRepository<Account, String>{
    Set<Account> getAll();

}
