package grundstuecke.Cat3;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _3_NeueStrasse {
    private final String name = "Neue Strasse";
    private final int preis = 160;
    private final int miete = 12;
    private final int hausPreis = 100;
    private final int mieteHaus1 = 60;
    private final int mieteHaus2 = 180;
    private final int mieteHaus3 = 500;
    private final int mieteHaus4 = 700;
    private final int mieteHotel = 900;
    private final int hypothek = 80;
    private final int hypothekMitZins = 88;
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
