package ac.za.cput.Services.Customer;

import ac.za.cput.Domain.Customer.AddMember;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface AddMemberService extends IService <AddMember, String>
{
    Set<AddMember> getAll();
}
