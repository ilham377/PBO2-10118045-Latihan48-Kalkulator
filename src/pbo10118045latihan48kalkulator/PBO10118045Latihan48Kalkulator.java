/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan48kalkulator;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : mumbuat kalkulator
 */
public class PBO10118045Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);
        System.out.println("Value 1 = "+kal.getValue1());
        System.out.println("Value 2 = "+kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result ADD is = "+kal.add(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Minus is = "+kal.minus(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Multiple is = "+kal.multiplication(kal.getValue1(),kal.getValue2()));
        System.out.println("Result DIvision is = "+kal.division(kal.getValue1(), kal.getValue2()));
    }
    
}
