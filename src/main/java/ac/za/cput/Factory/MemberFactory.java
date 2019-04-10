package ac.za.cput.Factory;

import ac.za.cput.Domain.Member;
import ac.za.cput.util.Misc;

public class MemberFactory {
    public static Member getMember(String firstName)
    {
        return new Member.Builder().id(Misc.generatedId())
                        .firstName(firstName)
                        .build();
    }
}
