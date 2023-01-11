package grundstuecke.Cat6;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _3_Goethestrasse {
    private final String name = "Goethestrasse";
    private final int preis = 280;
    private final int miete = 24;
    private final int hausPreis = 150;
    private final int mieteHaus1 = 120;
    private final int mieteHaus2 = 360;
    private final int mieteHaus3 = 850;
    private final int mieteHaus4 = 1025;
    private final int mieteHotel = 1200;
    private final int hypothek = 140;
    private final int hypothekMitZins = 154;
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

    public boolean istGekauft() {
        if (besitzerId == 0) {
            return false;
        } else {
            return true;
        }
    }
}
