package grundstuecke.Cat3;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _1_Seestrasse {
    private final String name = "Seestrasse";
    private final int preis = 140;
    private final int miete = 10;
    private final int hausPreis = 100;
    private final int mieteHaus1 = 50;
    private final int mieteHaus2 = 150;
    private final int mieteHaus3 = 450;
    private final int mieteHaus4 = 625;
    private final int mieteHotel = 750;
    private final int hypothek = 70;
    private final int hypothekMitZins = 77;
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
