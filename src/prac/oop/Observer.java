/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prac.oop;

/**
 *
 * @author bimya
 */
public interface Observer {
  public void position(int waterLevel);
   public void clear(boolean res);

    /**
     *
     * @param msg
     */
    public void receivemsg(String msg);
   // public void reciveMessage(String msg);

   
    public int getAmmo();
    public int getFual();
    public int getSoldier();

    
   // public void sendMessage(String message, WaterLevelObserver receiver);
    //public void receiveMessage(String message);
    //public String sendMessage(String msg);
  
    
    
}
