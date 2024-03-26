/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clean.code.tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author inclusiv academy
 */
public class CleanCodeTri {

    /**
     * Application de tri d'une liste d'entiers dans l'ordre croissant
     * 
     * 
     */
    public static void main(String[] args) {
        Integer [] tabList = addNumber();
        ArrayList<Integer> listSorted = sortedList(tabList);
        System.out.println(listSorted);
    }
    
    /**
        * Demande à l'utilisateur de saisir des nombres et les stocke dans un tableau.
        * 
        * @return Un tableau d'entiers contenant les nombres saisis par l'utilisateur.
    */
    public static Integer [] addNumber ()
    {
        Integer [] listTab = new Integer [5];
        System.out.println("Veuillez saisire les chiffres à trier : ");
        Scanner sca = new Scanner(System.in);
        for (int i = 0; i < listTab.length; i++) {
            listTab[i] = sca.nextInt();
        }
        
    return listTab;  
    }
       
    /**
        * Trie un tableau d'entiers et le convertit en ArrayList trié.
        * 
        * @param listTab Le tableau d'entiers à trier.
         * @return Un ArrayList contenant les entiers triés par ordre croissant.  
 */    
    public static ArrayList<Integer> sortedList (Integer [] listTab){ 
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(listTab));
        Collections.sort(numberList);
        return numberList;
    } 
}
