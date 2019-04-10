package ac.za.cput.Factory;

import ac.za.cput.Domain.Dvd;
import ac.za.cput.util.Misc;

public class DvdFactory {
    public static Dvd getDVD(String title)
    {
        return new Dvd.Builder().dvdId(Misc.generatedId())
                    .title(title)
                    .build;
    }
}
