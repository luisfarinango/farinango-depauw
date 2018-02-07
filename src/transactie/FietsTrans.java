package transactie;

import databag.Fiets;
import java.util.ArrayList;

/**
 *
 * @author Katrien.Deleu
 */
public class FietsTrans implements InterfaceFietsTrans {

    /**
     * Voegt een fiets toe
     *
     * @param fiets fiets die moet toegevoegd worden
     * @return id van de pas toegevoegde fiets
     */
    @Override
    public Integer toevoegenFiets(Fiets fiets) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Wijzigt de status van een actieve fiets naar herstel
     *
     * @param regnr registratienummer van de te wijzigen fiets
     */
    @Override
    public void wijzigenActiefNaarHerstel(Integer regnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Wijzigt de status van een actieve fiets naar uit omloop
     *
     * @param regnr registratienummer van de te wijzigen fiets
     */
    @Override
    public void wijzigenActiefNaarUitOmloop(Integer regnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Wijzigt de status van een fiets in herstel naar actief
     *
     * @param regnr registratienummer van de te wijzigen fiets
     */
    @Override
    public void wijzigenHerstelNaarActief(Integer regnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Wijzigt de status van een fiets in herstel naar uit omloop
     *
     * @param regnr registratienummer van de te wijzigen fiets
     */
    @Override
    public void wijzigenHerstelNaarUitOmloop(Integer regnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Wijzigt de opmerking van een fiets
     *
     * @param regnr registratienymmer van de te wijzigen fiets
     * @param opmerking nieuwe opmerking die toegevoegd moet worden aan de fiets
     */
    @Override
    public void wijzigenOpmerkingFiets(Integer regnr, String opmerking) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt een fiets
     *
     * @param registratienummer registratienummer van de te zoeken fiets
     * @return Fiets-object met alle gegevens van de gevonden fiets. Null indien
     * de fiets niet bestaat.
     */
    @Override
    public Fiets zoekFiets(Integer registratienummer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt alle fietsen.
     *
     * @return een arraylist met alle Fiets-objecten. Een lege lijst indien er
     * geen fietsen gevonden zijn.
     */
    @Override
    public ArrayList<Fiets> zoekAlleFietsen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
