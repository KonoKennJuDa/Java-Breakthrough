package Practice.Day12;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add( new MusicArtist("Member1", 50));
        members1.add( new MusicArtist("Member2", 50));
        members1.add( new MusicArtist("Member3", 50));
        members1.add( new MusicArtist("Member4", 50));
        members1.add( new MusicArtist("Member5", 50));

        MusicBand band1 = new MusicBand("band1", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add( new MusicArtist("Member6", 50));
        members2.add( new MusicArtist("Member7", 50));
        members2.add( new MusicArtist("Member8", 50));
        members2.add( new MusicArtist("Member9", 50));
        members2.add( new MusicArtist("Member10", 50));

        MusicBand band2 = new MusicBand("band2", 2005, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
