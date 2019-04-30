package ac.za.cput.Repository;

import ac.za.cput.Domain.Member.Notification;

import java.util.Set;

public interface NotificationRepository extends IRepository<Notification, String>{
    Set<Notification> getAll();
}
