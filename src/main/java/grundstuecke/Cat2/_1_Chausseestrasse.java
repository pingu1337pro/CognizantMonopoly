package grundstuecke.Cat2;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _1_Chausseestrasse {
    private final String name = "Chausseestrasse";
    private final int preis = 100;
    private final int miete = 6;
    private final int hausPreis = 50;
    private final int mieteHaus1 = 30;
    private final int mieteHaus2 = 90;
    private final int mieteHaus3 = 270;
    private final int mieteHaus4 = 400;
    private final int mieteHotel = 550;
    private final int hypothek = 50;
    private final int hypothekMitZins = 55;

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
