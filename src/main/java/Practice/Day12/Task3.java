//package Practice.Day12;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Task3 {
//
//    public static void main(String[] args) {
//
//        MusicBand band1 = new MusicBand("XXX", 1950);
//        MusicBand band2 = new MusicBand("YYY", 1920);
//        MusicBand band3 = new MusicBand("GGG", 1930);
//        MusicBand band4 = new MusicBand("FFF", 1910);
//        MusicBand band5 = new MusicBand("SSS", 2010);
//        MusicBand band6 = new MusicBand("ZZZ", 2015);
//
//
//        List<MusicBand> musicBands = new ArrayList<>();
//        musicBands.add(band1);
//        musicBands.add(band2);
//        musicBands.add(band3);
//        musicBands.add(band4);
//        musicBands.add(band5);
//        musicBands.add(band6);
//
//        System.out.println(musicBands);
//
//        Collections.shuffle(musicBands);
//
//        System.out.println(musicBands);
//
//        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
//
//        for (MusicBand band : musicBands) {
//            if (band.getYear() > 2000) {
//                musicBandsAfter2000.add(band);
//            }
//        }
//
//        System.out.println(musicBandsAfter2000);
//
//    }
//}
//
