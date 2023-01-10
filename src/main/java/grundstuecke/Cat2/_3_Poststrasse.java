package grundstuecke.Cat2;

import lombok.Getter;
import lombok.Setter;
@Getter
public class _3_Poststrasse {
    private final String name = "Poststrasse";
    private final int preis = 120;
    private final int miete = 8;
    private final int hausPreis = 50;
    private final int mieteHaus1 = 40;
    private final int mieteHaus2 = 100;
    private final int mieteHaus3 = 300;
    private final int mieteHaus4 = 450;
    private final int mieteHotel = 600;
    private final int hypothek = 60;
    private final int hypothekMitZins = 66;
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

