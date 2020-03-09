/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistors.java;
import javax.swing.*;


/**
 *
 * @author seden0957
 */
public class ResistorsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    String input = JOptionPane.showInputDialog("What is your resistors colour code? Seperate each colour by hyphens. Ex. Red-Orange-Black"); 
    //makes it so no matter if they use capitals or not, they will all be set to lower case
    input = input.toLowerCase();
    String colours[] = new String[10];
    colours[0] = "black";
    colours[1] = "brown";
    colours[2] = "red";
    colours[3] = "orange";
    colours[4] = "yellow";
    colours[5] = "green";
    colours[6] = "blue";
    colours[7] = "violet";
    colours[8] = "grey";
    colours[9] = "white";
  
    String[] resistorColours = input.split("-");
    int num1 = 0;
    int num2 = 0;
    double num3 = 0;
    //loops to check if the input is equal to each of the colours values
    for(int i = 0; i < resistorColours.length; i++){
        for (int o = 0; o < colours.length; o++) {
            //Check if input is equal
            if (resistorColours[i].equals(colours[o])) {
                //First occurance
                if (i == 0) {
                    num1 = o*10;
                }
                //second occurance
                else if (i == 1) {
                    num2 = o;
                }
                //multiplies by ten to move the first value over a placeholder
                else {
                    num3 = Math.pow(10, o);
                }
                break;
                }
            }
        }
        //output answer
        System.out.println("The resistor is " + ((num1 + num2)*num3) + " Ω");
    }
    
}
