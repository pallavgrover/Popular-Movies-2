package pallavgrover.popularmovies.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
 
import java.util.ArrayList;
import java.util.List;
 
 
public class Movie implements Parcelable{
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("overview")
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();
    @SerializedName("id")
    private Integer id;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("title")
    private String title;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("popularity")
    private Double popularity;
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("video")
    private Boolean video;
    @SerializedName("vote_average")
    private Double voteAverage;
 
    public Movie(String posterPath, boolean adult, String overview, String releaseDate, List<Integer> genreIds, Integer id,
                 String originalTitle, String originalLanguage, String title, String backdropPath, Double popularity,
                 Integer voteCount, Boolean video, Double voteAverage) {
        this.posterPath = posterPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalTitle = originalTitle;
        this.originalLanguage = originalLanguage;
        this.title = title;
        this.backdropPath = backdropPath;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.video = video;
        this.voteAverage = voteAverage;
    }
    public Movie(String title, String release_date, double vote_average, String overview, int id) {
        this.title = title;
        this.releaseDate = release_date;
        this.voteAverage = vote_average;
        this.overview = overview;
        this.id = id;
    }
    public Movie(Parcel in) {
        title = in.readString();
        releaseDate = in.readString();
        posterPath = in.readString();
        voteAverage = in.readDouble();
        overview = in.readString();
        id = in.readInt();

    }

    public String getPosterPath() {
        return posterPath;
    }
 
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
 
    public boolean isAdult() {
        return adult;
    }
 
    public void setAdult(boolean adult) {
        this.adult = adult;
    }
 
    public String getOverview() {
        return overview;
    }
 
    public void setOverview(String overview) {
        this.overview = overview;
    }
 
    public String getReleaseDate() {
        return releaseDate;
    }
 
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
 
    public List<Integer> getGenreIds() {
        return genreIds;
    }
 
    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getOriginalTitle() {
        return originalTitle;
    }
 
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
 
    public String getOriginalLanguage() {
        return originalLanguage;
    }
 
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getBackdropPath() {
        return backdropPath;
    }
 
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }
 
    public Double getPopularity() {
        return popularity;
    }
 
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }
 
    public Integer getVoteCount() {
        return voteCount;
    }
 
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
 
    public Boolean getVideo() {
        return video;
    }
 
    public void setVideo(Boolean video) {
        this.video = video;
    }
 
    public Double getVoteAverage() {
        return voteAverage;
    }
 
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(releaseDate);
        dest.writeString(posterPath);
        dest.writeDouble(voteAverage);
        dest.writeString(overview);
        dest.writeInt(id);
    }
    @SuppressWarnings("unused")
    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}