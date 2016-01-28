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
public class TestFruits {
    
    public static void main(String [] args){
    
        Fruit apple = new SampleApple();
        System.out.println(apple.getFruitName());
       
        apple = new FujiApple();
        System.out.println(apple.getFruitName());
        
        apple = new GalaApple();
        System.out.println(apple.getFruitName());
        
        
        
    }
    
}
