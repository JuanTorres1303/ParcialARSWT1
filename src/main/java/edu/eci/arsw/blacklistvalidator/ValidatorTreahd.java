package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

/**
 * ValidatorTreahd
 */
public class ValidatorTreahd extends Thread{
    private int limite_superior;
    private int limite_inferior;
    private String ipadress;
    private HostBlackListsValidator skds;
    private LinkedList ocurrences = new LinkedList();
    private int checkedListsCount = 0;

    

    public ValidatorTreahd(int limite_superior, int limite_inferior, String ipadress, HostBlackListsValidator skds) {
        this.limite_superior = limite_superior;
        this.limite_inferior = limite_inferior;
        this.ipadress = ipadress;
        this.skds = skds;
    }

    public void run(){
        for (int i = 0; i =limite_inferior; i < limite_superior; i ++){
            checkedListsCount++;
                if (skds.isInBlackListServer(i,ipadress)){
                    ocurrences.add(i);
                }
            }
    public int getLimite_inferior() {
        return limite_inferior;
    }
        
    public void setLimite_inferior(int limite_inferior) {
        this.limite_inferior = limite_inferior;
    }
}

   

