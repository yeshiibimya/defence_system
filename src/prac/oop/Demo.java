/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac.oop;
import UI.Helicopter;
import UI.Submarine;
import UI.Tank;
import UI.MainController;
/**
 *
 * @author bimya
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       Observable Observable=new Observable();
	 MainController main = new MainController(Observable);	
		
            
            Observable.addWaterLevelObserver( new Tank());
          Observable.addWaterLevelObserver( new Helicopter());
		Observable.addWaterLevelObserver( new Submarine());
                
            main.setVisible(true);
               
                
         
                
                

    }
    
}
