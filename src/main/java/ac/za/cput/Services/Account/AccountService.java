package ac.za.cput.Services.Account;

import ac.za.cput.Domain.Account.Account;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface AccountService extends IService <Account, String> {
    Set<Account> getAll();
}
