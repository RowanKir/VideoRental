package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Account.PaymentMethod;
import ac.za.cput.Repository.PaymentRepository;

import java.util.HashSet;
import java.util.Set;

public class PaymentRepositoryImpl implements PaymentRepository {

    private static PaymentRepositoryImpl repository = null;
    private Set<PaymentMethod> payment = new HashSet<>();

    public static PaymentRepositoryImpl getRepository()
    {
        if(repository == null) repository = new PaymentRepositoryImpl();
        return repository;
    }

    public PaymentMethod create (PaymentMethod payment)
    {
        this.payment.add(payment);
        return payment;
    }

    public PaymentMethod read (String payment)
    {
        return null;
    }

    public PaymentMethod update (PaymentMethod payment)
    {
        return null;
    }

    public void delete(String payment)
    {

    }

    public Set<PaymentMethod> getAll()
    {
        final Set<PaymentMethod> payment = this.payment;
        return payment;
    }
}
