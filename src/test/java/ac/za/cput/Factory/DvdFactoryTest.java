package ac.za.cput.Factory;

import ac.za.cput.Domain.Dvd;

import org.junit.Assert;
import org.junit.Test;

public class DvdFactoryTest {

    @org.junit.Test
    public void getDVD() {
        String name = "Video Store";
        Dvd d = DvdFactory.getDVD(name);
        System.out.println(d);
        Assert.assertNotNull(d.getId());
    }
}