/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burmashavejavapane;

/**
 *
 * @author masit
 */
import javax.swing.JOptionPane;
public class BurmaShaveJava {
    
    public static void main(String[] args){
        String[] rhyme = {
            "Shaving brushes",
            "You'll soon see 'em",
            "On a shelf",
            "In some meseum",
            };
        for (String line : rhyme) {
            JOptionPane.showMessageDialog(null, line, "Burma Shave", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}