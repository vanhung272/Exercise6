
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vanhung272
 */
public class ReplaceRepectitive {

    public static void Replace(String a) {
        Scanner sc = new Scanner(System.in);
        String[] s = a.split("\\s+");
        String s1 = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (i < s.length - 1 && s[i].equals(s[i + 1])) {
                s[i] = "";
                s[i + 1] = "REPEAT";
                i++;
            };
            list.add(s[i]);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }

//I want REPEAT go to REPEAT zoo 
//I am REPEAT REPEAT FPT Student 
//Introduction REPEAT SWE102 by REPEAT sonnp5 
//I wonder REPEAT how I wonder REPEAT why 
//Yesterday REPEAT blue bblue REPEAT    
    public static void main(String[] args) {
        System.out.println("Input:I want to to go to the the zoo");
        System.out.println("Output Expect:I want REPEAT go to REPEAT zoo");
        System.out.print("Real output:");
        Replace("I want to to go to the the zoo");
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println("Input:I am a a FPT FPT FPT Student");
        System.out.println("Output Expect:I am REPEAT REPEAT FPT Student");
        System.out.print("Real output:");
        Replace("I am a a FPT FPT FPT Student");
        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("Input:Introduction SWE102 SWE102 SWE102 by sonnp5 sonnp5 sonnp5");
        System.out.println("Output Expect:Introduction REPEAT SWE102 by REPEAT sonnp5 ");
        System.out.print("Real output:");
        Replace("Introduction SWE102 SWE102 SWE102 by sonnp5 sonnp5 sonnp5");
        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("Input:I wonder how how how I wonder why why why");
        System.out.println("Output Expect:I wonder REPEAT how I wonder REPEAT why");
        System.out.print("Real output:");
        Replace("I wonder how how how I wonder why why why");
        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("Input:Yesterday yesterday yesterday blue bblue sky sky");
        System.out.println("Output Expect:Yesterday REPEAT blue bblue REPEAT");
        System.out.print("Real output:");
        Replace("Yesterday yesterday yesterday blue bblue sky sky");
    }
}
