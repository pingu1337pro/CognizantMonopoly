package grundstuecke.Cat8;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _2_Schlossallee {
    private final String name = "Schlossallee";
    private final int preis = 400;
    private final int miete = 50;
    private final int hausPreis = 200;
    private final int mieteHaus1 = 200;
    private final int mieteHaus2 = 600;
    private final int mieteHaus3 = 1400;
    private final int mieteHaus4 = 1700;
    private final int mieteHotel = 2000;
    private final int hypothek = 200;
    private final int hypothekMitZins = 220;
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
