package ac.za.cput.Repository;

import ac.za.cput.Domain.VideoRentalStore.VideoRentalStore;

import java.util.Set;

public interface VideoRentalStoreRepository extends IRepository<VideoRentalStore, String>{
    Set<VideoRentalStore> getAll();
}
