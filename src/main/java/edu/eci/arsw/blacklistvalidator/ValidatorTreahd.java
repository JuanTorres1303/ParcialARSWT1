package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

/**
 * ValidatorTreahd
 */
public class ValidatorTreahd extends Thread{
    private int inicio;
    private int fin;
    private int contar_ocurrencias;
    private LinkedList<HostBlacklistsDataSourceFacade> server_disponibles;

    public void run(){
            System.out.println();
    }
    public int getInicio() {
        return inicio;
    }
    public int getFin() {
        return fin;
    }
    public int getContar_ocurrencias() {
        return contar_ocurrencias;
    }
}

