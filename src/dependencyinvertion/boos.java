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
public class boos implements interfaceBoos{
    worker mWorker;
    
    public boos(worker mWorker){
    this.mWorker= mWorker;}

    @Override
    public void openOffice() {
    mWorker.doJob();
    }
   
}
