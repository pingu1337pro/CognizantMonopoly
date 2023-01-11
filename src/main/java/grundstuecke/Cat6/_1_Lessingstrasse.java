package grundstuecke.Cat6;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _1_Lessingstrasse {
    private final String name = "Lessingstrasse";
    private final int preis = 260;
    private final int miete = 22;
    private final int hausPreis = 150;
    private final int mieteHaus1 = 110;
    private final int mieteHaus2 = 330;
    private final int mieteHaus3 = 800;
    private final int mieteHaus4 = 975;
    private final int mieteHotel = 1150;
    private final int hypothek = 130;
    private final int hypothekMitZins = 143;
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
