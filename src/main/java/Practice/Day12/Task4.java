package Practice.Day12;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Member1");
        members1.add("Member2");
        members1.add("Member3");
        members1.add("Member4");
        members1.add("Member5");
        members1.add("Member6");

        MusicBand band1 = new MusicBand("band1", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Member1");
        members2.add("Member2");
        members2.add("Member3");
        members2.add("Member4");
        members2.add("Member5");

        MusicBand band2 = new MusicBand("band2", 2005, members2);

        band1.printMembers();
        band2.printMembers();

    }
}
