package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Member.Notification;
import ac.za.cput.Repository.NotificationRepository;

import java.util.HashSet;
import java.util.Set;

public class NotificationRepositoryImpl implements NotificationRepository {

    private static NotificationRepositoryImpl repository = null;
    private Set<Notification> notifications = new HashSet<>();

    static NotificationRepositoryImpl getRepository()
    {
        if(repository == null) repository = new NotificationRepositoryImpl();
        return repository;
    }

    public Notification create (Notification notifications)
    {
        this.notifications.add(notifications);
        return notifications;
    }

    public Notification read (Notification notifications)
    {
        return null;
    }

    public Notification update (Notification notifications)
    {
        return null;
    }

    public void delete(String notifications)
    {

    }

    public Set<Notification> getAll()
    {
        final Set<Notification> notifications = this.notifications;
        return notifications;
    }
}
