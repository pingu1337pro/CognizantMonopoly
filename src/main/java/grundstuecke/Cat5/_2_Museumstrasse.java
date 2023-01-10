package grundstuecke.Cat5;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _2_Museumstrasse {
    private final String name = "Museumstrasse";
    private final int preis = 220;
    private final int miete = 18;
    private final int hausPreis = 150;
    private final int mieteHaus1 = 90;
    private final int mieteHaus2 = 250;
    private final int mieteHaus3 = 700;
    private final int mieteHaus4 = 875;
    private final int mieteHotel = 1050;
    private final int hypothek = 110;
    private final int hypothekMitZins = 121;
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
