package ac.za.cput.Repository;

import ac.za.cput.Domain.Customer.AddMember;

import java.util.Set;

public interface AddRepository extends IRepository<AddMember, String>{
    Set<AddMember> getAll();
}
