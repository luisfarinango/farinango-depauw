/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactie;

import databag.Rit;
import java.util.ArrayList;

/**
 *
 * @author Katrien.Deleu
 */
public class RitTrans implements InterfaceRitTrans {

    /**
     * Voegt een rit toe
     *
     * @param rit rit die moet toegevoegd worden
     * @return id van de pas toegevoegde rit
     */
    @Override
    public Integer toevoegenRit(Rit rit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Sluit een rit af.
     *
     * @param id id van de rit die afgesloten moet worden
     */
    @Override
    public void afsluitenRit(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt alle ritten.
     *
     * @return een arraylist met alle Rit-objecten. Een lege lijst indien er
     * geen ritten gevonden zijn.
     */
    @Override
    public ArrayList zoekAlleRitten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * Zoekt een rit
     *
     * @param ritID id van de te zoeken rit
     * @return Rit-object met alle gegevens van de gevonden rit. Null indien de
     * rit niet bestaat.
     */
    @Override
    public Rit zoekRit(Integer ritID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt het id van de eerste rit van een lid
     *
     * @param rr rijksregeisternummer van het lid waarvan de eerste rit gezocht
     * wordt
     * @return id van de eerste rit van een lid
     */
    @Override
    public Integer zoekEersteRitVanLid(String rr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt de actieve ritten van een lid (dus alle openstaande ritten op dit
     * moment van een lid).
     *
     * @param rr rijksregeisternummer van het lid waarvan de actieve ritten
     * worden gezocht
     * @return een arraylist van alle actieve ritten van een gegeven lid
     */
    @Override
    public ArrayList zoekActieveRittenVanLid(String rr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Zoekt de actieve ritten van een fiets (dus alle openstaande ritten op dit
     * moment van een fiets).
     *
     * @param regnr registernummer van de fiets waarvan de actieve ritten worden
     * gezocht
     * @return een arraylist van alle actieve ritten van een gegeven fiets
     */
    @Override
    public ArrayList zoekActieveRittenVanFiets(Integer regnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
