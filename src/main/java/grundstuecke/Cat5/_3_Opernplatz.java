package grundstuecke.Cat5;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _3_Opernplatz {
    private final String name = "Opernplatz";
    private final int preis = 240;
    private final int miete = 20;
    private final int hausPreis = 150;
    private final int mieteHaus1 = 100;
    private final int mieteHaus2 = 300;
    private final int mieteHaus3 = 750;
    private final int mieteHaus4 = 925;
    private final int mieteHotel = 1100;
    private final int hypothek = 120;
    private final int hypothekMitZins = 132;
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
