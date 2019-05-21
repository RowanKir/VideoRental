package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Member.Notification;
import ac.za.cput.Repository.Impl.NotificationRepositoryImpl;
import ac.za.cput.Repository.NotificationRepository;
import ac.za.cput.Services.Member.NotificationService;

import java.util.Set;

public class NotificationServiceImpl implements NotificationService {

    private static NotificationServiceImpl service = null;
    private NotificationRepository repository;

    private NotificationServiceImpl()
    {
        this.repository = NotificationRepositoryImpl.getRepository();
    }

    public static NotificationServiceImpl getService(){
        if (service == null) service = new NotificationServiceImpl();
        return service;
    }

    @Override
    public Notification create(Notification type) {
        return this.repository.create(type);
    }

    @Override
    public Notification update(Notification type) {
        return this.repository.update(type);

    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Notification read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Notification> getAll() {
        return this.repository.getAll();

    }
}
