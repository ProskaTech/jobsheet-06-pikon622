/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package job6;

/**
 *
 * @author Pikonnn
 */
public class grade1 {
    
public static void main(String[] args) {
         double grade = 92.0;
         
         if(grade >= 90){
             System.out.println("Excellent!");
         }
         /*Untuk menentukan kondisi yang mempunyai nilai rentangan maka tentukan
         nilai batas atas dan batas bawah setelah itu digabungkan dengan logika 
         AND (&&)*/
         else if((grade < 90) && (grade >= 80)){ // 80 s.d. 89
             System.out.println("Good Job!");
         }
         else if((grade < 80) && (grade >= 60)){ // 60 s.d. 79
             System.out.println("Study Harder!");
         }
         else {
             System.out.println("Sorry, You Failed.");
         }
     }
}

