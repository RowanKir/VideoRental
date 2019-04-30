package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.RentalCodeStatus;
import ac.za.cput.Domain.VideoRentalStore.VideoRentalStore;
import ac.za.cput.Repository.VideoRentalStoreRepository;

import java.util.HashSet;
import java.util.Set;

public class VideoRentalStoreRepositoryImpl implements VideoRentalStoreRepository {

    private static VideoRentalStoreRepositoryImpl repository = null;
    private Set<VideoRentalStore> store = new HashSet<>();

    static VideoRentalStoreRepositoryImpl getRepository()
    {
        if(repository == null) repository = new VideoRentalStoreRepositoryImpl();
        return repository;
    }

    public VideoRentalStore create (VideoRentalStore store)
    {
        this.store.add(store);
        return store;
    }

    public VideoRentalStore read (VideoRentalStore store)
    {
        return null;
    }

    public VideoRentalStore update (VideoRentalStore store)
    {
        return null;
    }

    public void delete(String store)
    {

    }

    public Set<VideoRentalStore> getAll()
    {
        final Set<VideoRentalStore> store = this.store;
        return store;
    }
}
