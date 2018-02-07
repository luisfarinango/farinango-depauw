package database;

import databag.Lid;
import java.util.ArrayList;

/**
 *
 * @author Katrien.Deleu
 */
public class LidDB implements InterfaceLidDB {

    /**
     * Voegt een lid toe
     *
     * @param lid lid dat toegevoegd moet worden
     */
    @Override
    public void toevoegenLid(Lid lid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Wijzigt een lid
     *
     * @param lid het nieuwe lid (rijksregisternummer kan niet gewijzigd worden)
     */
    @Override
    public void wijzigenLid(Lid lid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Schrijft een lid uit.
     *
     * @param rr rijksregisternummer van het uit te schrijven lid
     */
    @Override
    public void uitschrijvenLid(String rr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt een lid.
     *
     * @param rijksregisternummer het rijksregisternummer van het te zoeken lid
     * @return Lid-object met alle gegevens van het gevonden lid. Null indien
     * het lid niet bestaat.
     */
    @Override
    public Lid zoekLid(String rijksregisternummer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt alle leden.
     *
     * @return een arraylist met alle Lid-objecten. Een lege lijst indien er
     * geen leden gevonden zijn.
     */
    @Override
    public ArrayList<Lid> zoekAlleLeden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
