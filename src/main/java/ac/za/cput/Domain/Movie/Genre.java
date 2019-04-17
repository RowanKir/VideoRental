package ac.za.cput.Domain.Movie;

public class Genre {

    int genreCode;
    String genreDescription;

    public Genre(Builder builder) {
        this.genreCode = builder.genreCode;
        this.genreDescription = builder.genreDescription;
    }

    public int getGenreCode() {
        return genreCode;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public static class Builder
    {
        int genreCode;
        String genreDescription;

        public Builder genreCode(int genreCode)
        {
            this.genreCode = genreCode;
            return this;
        }

        public Builder genreDescription(String genreDescription)
        {
            this.genreDescription = genreDescription;
            return this;
        }

        public Genre build()
        {
            return new Genre(this);
        }
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreCode=" + genreCode +
                ", genreDescription='" + genreDescription + '\'' +
                '}';
    }
}
