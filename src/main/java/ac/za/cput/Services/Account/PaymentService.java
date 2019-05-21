package ac.za.cput.Services.Account;

import ac.za.cput.Domain.Account.PaymentMethod;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface PaymentService extends IService <PaymentMethod, String> {
    Set<PaymentMethod> getAll();
}
