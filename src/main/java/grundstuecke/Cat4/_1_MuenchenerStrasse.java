package grundstuecke.Cat4;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _1_MuenchenerStrasse {
    private final String name = "Muenchener Strasse";
    private final int preis = 180;
    private final int miete = 14;
    private final int hausPreis = 100;
    private final int mieteHaus1 = 70;
    private final int mieteHaus2 = 200;
    private final int mieteHaus3 = 550;
    private final int mieteHaus4 = 750;
    private final int mieteHotel = 950;
    private final int hypothek = 90;
    private final int hypothekMitZins = 99;

    @Setter
    private int anzahlHaeuser = 0;
    @Setter
    private boolean hatHotel = false;
    @Setter
    private boolean hatHypothek = false;
    @Setter
    private boolean istGekauft = false;
    @Setter
    private int besitzerId = 0;

}
