package grundstuecke.Cat1;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _2_Turmstrasse {
    private final String name = "Turmstrasse";
    private final int preis = 60;
    private final int miete = 4;
    private final int hausPreis = 100;
    private final int mieteHaus1 = 20;
    private final int mieteHaus2 = 60;
    private final int mieteHaus3 = 180;
    private final int mieteHaus4 = 320;
    private final int mieteHotel = 450;
    private final int hypothek = 30;
    private final int hypothekMitZins = 33;
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

