package grundstuecke.Cat8;

import lombok.Getter;
import lombok.Setter;
@Getter
public class _1_Parkstrasse {
    private final String name = "Parkstrasse";
    private final int preis = 350;
    private final int miete = 35;
    private final int hausPreis = 200;
    private final int mieteHaus1 = 175;
    private final int mieteHaus2 = 500;
    private final int mieteHaus3 = 1100;
    private final int mieteHaus4 = 1300;
    private final int mieteHotel = 1500;
    private final int hypothek = 175;
    private final int hypothekMitZins = 193;
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
