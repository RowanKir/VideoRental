package ac.za.cput.Services.Member;

import ac.za.cput.Domain.Member.Notification;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface NotificationService extends IService<Notification, String>
{
    Set<Notification> getAll();
}
