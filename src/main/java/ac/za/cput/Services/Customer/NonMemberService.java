package ac.za.cput.Services.Customer;

import ac.za.cput.Domain.Customer.NonMember;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface NonMemberService extends IService<NonMember, String>
{
    Set<NonMember> getAll();
}
