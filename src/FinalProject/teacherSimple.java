package FinalProject;

import javax.swing.*;

import java.util.*;

import java.io.*;





public class teacherSimple { // utilities



 private static InputStream is = System.in;

 private static Scanner kb = new Scanner (is);



 private static boolean useOptionPane = true;



 public static void toggleUserIO () {

   if (useOptionPane) { // set up for use of Scanner

     useOptionPane = false;

     putMessageToUser ("\nNow using Scanner (System.in) ");

   } else {

     useOptionPane = true; // set up for use of JOptionPane

     putMessageToUser ("\nNow using JOptionPane ");

   }

 }







 public static String getUserString (String prompt) {

   String s = "";

   try {

     if (useOptionPane)

       s = JOptionPane.showInputDialog(prompt + "?");

     else {

       System.out.print (prompt);

       s = kb.nextLine ();

       //kb.close ();

     }

   } catch (Exception e) {

     JOptionPane.showMessageDialog (null, "getUserString s = " + s + " Exc = " + e);

     e.printStackTrace ();

   }

   //JOptionPane.showMessageDialog (null, "getUserString s = " + s);

   return s;

 }









 public static double getUserDouble (String mes) {

   String snum = getUserString(mes);

   double num = 0.;



   try {

     num = Double.parseDouble (snum);

   } catch (Exception ex) {

     putMessageToUser ("Your input " + snum + " caused " + ex);

   }

   return num;

 }// end getUserDouble method









 public static int getUserInt (String mes) {

   String snum = getUserString(mes);

   int num = 0;



   try {

     num = Integer.parseInt (snum);

   } catch (Exception ex) {

     putMessageToUser ("Your input " + snum + " caused " + ex);

     num = 0;

   }

   return num;

 }// end getUserInt method







 public static void putMessageToUser (String mes) {

   if (mes != null && mes.length () > 0) {

     if (useOptionPane)

       JOptionPane.showMessageDialog (null, mes);

     else

       System.out.println (mes);

   } else

     if (!useOptionPane)

       System.out.println ();

 }// end putMessageToUser method

} // end U class