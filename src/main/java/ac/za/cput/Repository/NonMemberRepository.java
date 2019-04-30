package ac.za.cput.Repository;

import ac.za.cput.Domain.Customer.NonMember;

import java.util.Set;

public interface NonMemberRepository extends IRepository<NonMember, String>{
    Set<NonMember> getAll();
}
