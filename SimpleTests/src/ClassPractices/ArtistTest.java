package ClassPractices;
import java.time.*;

public class ArtistTest {
    public static void main(String[] args) {
        Artist[] rapper = new Artist[3];

        rapper[0] = new Artist("Kendrick Lamar", 43, 1987, 6, 17);
        rapper[1] = new Artist("Jermaine Cole", 13, 1985, 1, 28);
        rapper[2] = new Artist("Bobby Tarantino", 9, 1990, 1, 22);

        // to make them publish albums or singles kiki
        for (Artist n : rapper)
            n.publishAlbum(2);

        // print out info about all Artist objects
        for (Artist n : rapper)
            System.out.println("name=" + n.getName() + ", Albums=" + n.getAlbum() + ", BDay=" + n.getBDay());
    }
}

class Artist {
    private String name;
    private int albums;
    private LocalDate BDay;

    public Artist(String name, int album, int year, int month, int day) {
        this.name = name;
        this.albums = album;
        this.BDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return this.name;
    }

    public int getAlbum() {
        return this.albums;
    }

    public LocalDate getBDay() {
        return this.BDay;
    }

    public void publishAlbum(int number) {
        this.albums += number;
    }
}