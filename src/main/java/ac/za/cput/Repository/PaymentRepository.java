package ac.za.cput.Repository;

import ac.za.cput.Domain.Account.PaymentMethod;

import java.util.Set;

public interface PaymentRepository extends IRepository<PaymentMethod, String>{
    Set<PaymentMethod> getAll();
}
