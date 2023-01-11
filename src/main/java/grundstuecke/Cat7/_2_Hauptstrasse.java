package grundstuecke.Cat7;

import lombok.Getter;
import lombok.Setter;
@Getter
public class _2_Hauptstrasse {
    private final String name = "Hauptstrasse";
    private final int preis = 300;
    private final int miete = 26;
    private final int hausPreis = 200;
    private final int mieteHaus1 = 130;
    private final int mieteHaus2 = 390;
    private final int mieteHaus3 = 900;
    private final int mieteHaus4 = 1100;
    private final int mieteHotel = 1275;
    private final int hypothek = 150;
    private final int hypothekMitZins = 165;
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
