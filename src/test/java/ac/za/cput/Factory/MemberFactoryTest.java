package ac.za.cput.Factory;

import ac.za.cput.Domain.Member;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberFactoryTest {

    @Test
    public void getMember() {
        String name = "Rowan";
        Member m = MemberFactory.getMember(name);
        System.out.println(m);
        Assert.assertNotNull(m.getId());
    }
}