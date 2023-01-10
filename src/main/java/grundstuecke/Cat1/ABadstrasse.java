package grundstuecke.Cat1;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ABadstrasse {
    private final String name = "Badstrasse";
    private final int preis = 60;
    private final int miete = 2;
    private final int hausPreis = 50;
    private final int mieteHaus1 = 10;
    private final int mieteHaus2 = 30;
    private final int mieteHaus3 = 90;
    private final int mieteHaus4 = 160;
    private final int mieteHotel = 250;
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


}
