/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product[] tablica = new Product[10];
       tablica [0] = new Ksiażka(1,"Abc","111");
       tablica [1] = new Czekolada (1,"Abc","111");
       tablica [2] = new Ksiażka(1,"Abc","111");
       tablica [3] = new Długopis(1,"Abc","111");
       tablica [4] = new Dżem(1,"Abc","111");
       tablica [5] = new Polopiryna(1,"Abc","111");
       tablica [6] = new Dżem(1,"Abc","111");
       tablica [8] = new Czekolada(1,"Abc","111");
       tablica [8] = new Długopis(1,"Abc","111");
       tablica [9] = new Ksiażka(1,"Abc","111");
       for ( int i=0;i<10;i++){
        tablica[i].buy();
        tablica[i].showInfo();
    }
    }
}
