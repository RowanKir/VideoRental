package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Account.PaymentMethod;
import ac.za.cput.Repository.Impl.PaymentRepositoryImpl;
import ac.za.cput.Repository.PaymentRepository;
import ac.za.cput.Services.Account.PaymentService;

import java.util.Set;

public class PaymentServiceImpl implements PaymentService {

    private static PaymentServiceImpl service = null;
    private PaymentRepository repository;

    private PaymentServiceImpl()
    {
        this.repository = PaymentRepositoryImpl.getRepository();
    }

    public static PaymentServiceImpl getService(){
        if (service == null) service = new PaymentServiceImpl();
        return service;
    }

    @Override
    public PaymentMethod create(PaymentMethod type) {
        return this.repository.create(type);
    }

    @Override
    public PaymentMethod update(PaymentMethod type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }

    @Override
    public PaymentMethod read(String s) {
        return this.repository.read(s);    }

    @Override
    public Set<PaymentMethod> getAll() {
        return this.repository.getAll();

    }

}
