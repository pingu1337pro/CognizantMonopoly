package grundstuecke.Cat7;

import lombok.Getter;
import lombok.Setter;
@Getter
public class _3_Bahnhofstrasse {
    private final  String name = "Bahnhofstrasse";
    private final  int preis = 320;
    private final  int miete = 28;
    private final  int hausPreis = 200;
    private final  int mieteHaus1 = 150;
    private final  int mieteHaus2 = 450;
    private final  int mieteHaus3 = 1000;
    private final  int mieteHaus4 = 1200;
    private final  int mieteHotel = 1400;
    private final  int hypothek = 160;
    private final  int hypothekMitZins = 176;
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
