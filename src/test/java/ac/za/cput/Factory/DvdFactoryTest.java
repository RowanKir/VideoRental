package ac.za.cput.Factory;

import ac.za.cput.Domain.Dvd;

import static org.junit.Assert.*;

public class DvdFactoryTest {

    @org.junit.Test
    public void getDVD() {
        String name = "Video Store";
        Dvd d = DvdFactory.getDVD(name);
        System.out.println(d);
        Assert.assertNotNull(d.getId());
    }
}