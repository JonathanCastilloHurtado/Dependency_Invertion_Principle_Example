/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinvertion;

/**
 *
 * @author JonathanC
 */
public class DependencyInvertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        worker godinez= new worker();
        boos paulo= new boos(godinez);
        paulo.openOffice();
    }
    
}
