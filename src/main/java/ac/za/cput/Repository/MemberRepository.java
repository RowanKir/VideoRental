package ac.za.cput.Repository;

import ac.za.cput.Domain.Member.Member;

import java.util.Set;

public interface MemberRepository extends IRepository<Member, String>{
    Set<Member> getAll();
}
