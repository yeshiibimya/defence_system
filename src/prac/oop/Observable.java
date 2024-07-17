/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac.oop;

import java.util.ArrayList;

/**
 *
 * @author bimya
 */
public class Observable implements ObservableInterface{
    private int waterLevel;
	private final ArrayList<Observer>observerList=new ArrayList<>();
    private int totalammo=0;
    private int totalfual=0;
    private int totalsoldier=0;
    private int lastcountfual=0;
    private int lastcountammo=0;
    private int lastcountsoldier=0;
    private String msg;	
	public void addWaterLevelObserver(Observer ob){
		observerList.add(ob);
	}	
	
    @Override
	public void methodPosition(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
			notifyObject();
		}
	}
	public void notifyObject(){
		for(Observer ob : observerList){
			ob.position(waterLevel);
		}
	}
        
    
    @Override
      public void methodClear(boolean res){
        {
            notifyObject(res);
        }
    }
      public void notifyObject(boolean res){
		for(Observer ob : observerList){
			 ob.clear(res);
		}
	}

 @Override
      public void methodreciveMsg(String msg){
        notifyObject(msg);
        }
    
     public void notifyObject(String msg){
	for(Observer ob : observerList){
			 ob.receivemsg(msg);
		}
		}

    @Override
    public void totalAmmo(int count) {
        collectAmmofromObj();
    }

    
    public int collectAmmofromObj() {
     for(Observer ob : observerList){
		 totalammo = (ob.getAmmo()+ totalammo);
		}
     lastcountammo=totalammo;
     totalammo=0;
		return totalammo;}  
    @Override
    public void totalFual(int count) {
        collectFualfromObj();
        
    }

    
    public int collectFualfromObj() {
     for(Observer ob : observerList){
		 totalfual = (ob.getFual()+ totalfual);
	
     }lastcountfual=totalfual;
        totalfual=0;
		return lastcountfual;
    }  
    @Override
    public void totalSoldier(int count) {
        collectsoldierfromObj();
    }

    
    public int collectsoldierfromObj() {
     for(Observer ob : observerList){
		 totalsoldier = (ob.getSoldier()+ totalsoldier);
		}
     lastcountsoldier=totalsoldier;
     totalsoldier=0;
		return totalsoldier;
    }  

 /*   @Override
    public void methodsendMsg(String msg) {
       getresultsfromObj(); 
    }
    
     public void  passresultsfromObj() {
     for(WaterLevelObserver ob : observerList){
	ob.sendMessage(msg);
        
     }  
    
}*/
    /* public void broadcastMessage(String message) {
        for (WaterLevelObserver ob : observerList) {
            ob.receiveMessage(message);*/
        
    
}


