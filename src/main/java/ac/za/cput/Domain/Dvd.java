package ac.za.cput.Domain;

public class Dvd {

    private String title, category;
    private int dvdId;

    public Dvd()
    {

    }
    public Dvd(Builder builder) {
        this.title = builder.title;
        this.category = builder.category;
        this.dvdId = builder.dvdId;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getDvdId() {
        return dvdId;

    }

    public static class Builder
    {
        private String title, category;
        private int dvdId;

        public Builder title(String title)
        {
            this.title = title;
            return this;
        }

        public Builder category(String category)
        {
            this.category = category;
            return this;
        }

        public Builder dvdId(int dvdId)
        {
            this.dvdId = dvdId;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", dvdId=" + dvdId +
                '}';
    }
}
