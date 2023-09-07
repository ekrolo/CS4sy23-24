/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class CS4CharmOlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String s1Name = "Khel";
        String s1Power = "Rapid Recovery";
        int s1Age = 15;
        
        String s2Name = "Bong-Seok";
        String s2Power = "Flight";
        int s2Age = 17;
        
        String s3Name = "Hui-Soo";
        String s3Power = "Rapid Recovery";
        int s3Age = 16; 
        
        int avAge = (s1Age + s2Age + s3Age)/3;
        boolean oldest = s3Age > s2Age;
        boolean samePower = s1Power == s3Power;
        
        System.out.println("Jeongwon High School Special Student Profile: \n");
        
        
        System.out.println("Student 1:");
        
        System.out.println("Name: " + s1Name);
        System.out.println("Power: " + s1Power);
        System.out.println("Age: " + s1Age);
        
        
        System.out.println("Student 2:");
        
        System.out.println("Name: " + s2Name);
        System.out.println("Power: " + s2Power);
        System.out.println("Age: " + s2Age);
        
        System.out.println("Student 3:");
        
        System.out.println("Name: " + s3Name);
        System.out.println("Power: " + s3Power);
        System.out.println("Age: " + s3Age);
        
        
        System.out.println("Average age of students: " + avAge);
        System.out.println("Hui-Soo is the oldest of the three: " + oldest);
        System.out.println("Khel and Hui-Soo have the same power: " + samePower);
    }
    
}
