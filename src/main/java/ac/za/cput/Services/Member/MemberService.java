package ac.za.cput.Services.Member;

import ac.za.cput.Domain.Member.Member;
import ac.za.cput.Services.IService;

import java.util.Set;

public interface MemberService extends IService<Member, String>
{
    Set<Member> getAll();
}
