package ac.za.cput.Factory.VideoRentalStore;

import ac.za.cput.Domain.VideoRentalStore.Admin;

public class AdminFactory {

    public static Admin getAdmin(int adminId,String adminName,String adminLogin)
    {
        return new Admin.Builder()
                .adminId(adminId)
                .adminName(adminName)
                .adminLogin(adminLogin)
                .build();
    }
}
