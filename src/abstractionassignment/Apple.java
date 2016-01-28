/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionassignment;

/**
 *
 * @author Dell
 */
public abstract class Apple implements Fruit{
   @Override
    public String getFruitName(){
        
        return "Apple";
    }
    
    public abstract void display();
}
