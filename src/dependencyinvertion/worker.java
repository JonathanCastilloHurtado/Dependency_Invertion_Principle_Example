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
public class worker implements interfaceWorker {

    @Override
    public void doJob() {
    System.out.println("Working");
    }
    
}
