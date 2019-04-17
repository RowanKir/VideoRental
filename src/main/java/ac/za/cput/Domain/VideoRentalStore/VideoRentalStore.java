package ac.za.cput.Domain.VideoRentalStore;

public class VideoRentalStore {

    int storeId, addressId, storePhone;
    String storeName, storeEmail;

    public VideoRentalStore(Builder builder) {
        this.storeId = builder.storeId;
        this.addressId = builder.addressId;
        this.storePhone = builder.storePhone;
        this.storeName = builder.storeName;
        this.storeEmail = builder.storeEmail;
    }

    public int getStoreId() {
        return storeId;
    }

    public int getAdressId() {
        return addressId;
    }

    public int getStorePhone() {
        return storePhone;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public static class Builder
    {
        int storeId, addressId, storePhone;
        String storeName, storeEmail;

        public Builder storeId(int storeId)
        {
            this.storeId = storeId;
            return this;
        }
        public Builder addressId(int addressId)
        {
            this.addressId = addressId;
            return this;
        }

        public Builder storePhone(int storePhone)
        {
            this.storePhone = storePhone;
            return this;
        }

        public Builder storeName(String storeName)
        {
            this.storeName = storeName;
            return this;
        }

        public Builder storeEmail(String storeEmail)
        {
            this.storeEmail = storeEmail;
            return this;
        }

        public VideoRentalStore build()
        {
            return new VideoRentalStore(this);
        }
    }

    @Override
    public String toString() {
        return "VideoRentalStore{" +
                "storeId=" + storeId +
                ", addressId=" + addressId +
                ", storePhone=" + storePhone +
                ", storeName='" + storeName + '\'' +
                ", storeEmail='" + storeEmail + '\'' +
                '}';
    }
}
