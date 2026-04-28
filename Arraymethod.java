/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethod;

import java.util.Scanner;

/**
 *
 * @author Moiz_Noob
 */
public class Arraymethod {

    /**
     * @param args the command line arguments
     */
    //bus function
    public static void bus() {
           Scanner s = new Scanner(System.in);
 System.out.println("enter numbers of records you want to store");
        int b=s.nextInt();
        int[] bid = new int[b];
        int[] bc = new int[b];
        String[] bt = new String[b];
        String[] md = new String[b];
        String[] bn = new String[b];

     
        System.out.println("BUS MODULE");
        System.out.println("_________________________________________________________________________________________________________");
        for (int i = 0; i < bt.length; i++) {
            System.out.println("enter  bus ID" + (i + 1));
            bid[i] = s.nextInt();
            s.nextLine();
            System.out.println("Enter  bus number" + (i + 1));
            bn[i] = s.nextLine();
            System.out.println("enter bus type" + (i + 1));
            bt[i] = s.nextLine();

            System.out.println("enter bus capacity" + (i + 1));
            bc[i] = s.nextInt();
            s.nextLine();
            System.out.println("enter last maintenance date" + (i + 1));
            md[i] = s.nextLine();
        }
                System.out.println("_________________________________________________________________________________________________________");
        System.out.println("Bus ID:           Bus Number:          Bus Type:        Bus Capacity:          Last Maintenance:");

        for (int i = 0; i < bt.length; i++) {
            System.out.printf("%-20d %-20s %-20s %-20d %-20s\n", bid[i], bn[i], bt[i], bc[i], md[i]);

        }
        System.out.println("_________________________________________________________________________________________________________");
        System.out.println("if you want to see any individual record press S");
        char c = s.next().charAt(0);

        while (c == 's' || c == 'S') {
            System.out.println("if you want to see any individual record enter bus id");
            int sbid = s.nextInt();

            for (int i = 0; i < bt.length; i++) {

                if (bid[i] == sbid) {
                    System.out.println("Bus ID:           Bus Number:          Bus Type:        Bus Capacity:          Last Maintenance:");
                    System.out.printf("%-20d %-20s %-20s %-20d %-20s\n", bid[i], bn[i], bt[i], bc[i], md[i]);
                }
            }
            System.out.println("if you want to see any other record press 's' again");
            c = s.next().charAt(0);

        

        
        }
    }

    //route function
    public static void route() {
        Scanner s = new Scanner(System.in);
         System.out.println("enter numbers of records you want to store");
        int b=s.nextInt();
        int[] rid = new int[b];
        String[] sp = new String[b];
        String[] ep = new String[b];
        int[] ns = new int[b];
        float[] d = new float[b];

        System.out.println("ROUTE MODULE");
        System.out.println("_________________________________________________________________________________________________________");
        for (int i = 0; i < sp.length; i++) {
            System.out.println("ENTER ROUTE ID "+(i+1));
            rid[i] = s.nextInt();
            s.nextLine();
            System.out.println("START POINT LOCATION NAME " + (i + 1));
            sp[i] = s.nextLine();
            System.out.println("ENDING POINT LOCATION NAME " + (i + 1));
            ep[i] = s.nextLine();
            System.out.println("ENTER TOTAL NUMBER OF STOPS " + (i + 1));
            ns[i] = s.nextInt();
            System.out.println("ENTER DISTANCE IN KMS " + (i + 1));
            d[i] = s.nextFloat();
        }
        System.out.println("_________________________________________________________________________________________________________");
        System.out.println("ROUTE ID:         START POINT:     END POINT LOCATION:     NUMBER OF STOPS:       TOTAL DISTANCE:");
        for (int i = 0; i < sp.length; i++) {

            System.out.printf("%-20d %-20s %-20s %-20d %-20.2f\n", rid[i], sp[i], ep[i], ns[i],d[i]);
        }
        System.out.println("_________________________________________________________________________________________________________");
        System.out.println("if you want to see any individual record press S");
        char c = s.next().charAt(0);

        while (c == 's' || c == 'S') {
            System.out.println("if you want to see any individual record enter route id");
            int srid = s.nextInt();

            for (int i = 0; i < sp.length; i++) {

                if (rid[i] == srid) {
                    System.out.println("ROUTE ID:         START POINT:     END POINT LOCATION:     NUMBER OF STOPS:       TOTAL DISTANCE:");
                    System.out.printf("%-20d %-20s %-20s %-20d %-20.2f\n", rid[i], sp[i], ep[i], ns[i],d[i]);
                }}
                System.out.println("if you want to see any other record press 's' again");
                c = s.next().charAt(0);

            
        }

    }

    //driver function
    public static void driver() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter numbers of records you want to store");
        int b=s.nextInt();
        int[] did = new int[b];
        String[] dn = new String[b];
        String[] dln = new String[b];
        String[] dc = new String[b];
        int[] ds = new int[b];
        double[] st = new double[b];
        System.out.println("DRIVER MODULE");
        System.out.println("_________________________________________________________________________________________________________");
        s.nextLine();
        for (int i = 0; i < st.length; i++) {
            
            System.out.println("Enter driver name: " + (i + 1));
            dn[i] = s.nextLine();

            System.out.println("Enter driver id" + (i + 1));
            did[i] = s.nextInt();
            s.nextLine();
            System.out.println("Enter License Number: " + (i + 1));
            dln[i] = s.nextLine();
            System.out.println("Enter driver contact:" + (i + 1));
            dc[i] = s.nextLine();
            System.out.println("Enter driver salary:" + (i + 1));

            ds[i] = s.nextInt();
            s.nextLine();
            st[i] = tax(ds[i]);
        }
        System.out.println("_________________________________________________________________________________________________________");

        System.out.println("Name:           license no:              id:              contact:             salary:           salary after tax");
        for (int x = 0; x < st.length; x++) {
            System.out.printf("%-20s %-20s %-20d %-20s %-20d %-20.2f \n", dn[x], dln[x], did[x], dc[x], ds[x], st[x]);
        }
                System.out.println("_________________________________________________________________________________________________________");
        System.out.println("if you want to see any individual record press S");
        char c = s.next().charAt(0);
        while (c == 's' || c == 'S') {
            System.out.println("if you want to see any individual record enter driver id");
            int sdid = s.nextInt();
            for (int y = 0; y < st.length; y++) {

                if (did[y] == sdid) {
                    System.out.println("Name:           license no:              id:              contact:             salary:           salary after tax");
                    System.out.printf("%-20s %-20s %-20d %-20s %-20d %-20.2f \n", dn[y], dln[y], did[y], dc[y], ds[y], st[y]);
                }
            }
            System.out.println("if you want to see any other record press 's' again");
            c = s.next().charAt(0);

        }

    }

    //student function
    public static void student() {
        Scanner s = new Scanner(System.in);
         System.out.println("enter numbers of records you want to store");
        int b=s.nextInt();
        {

            int[] sid = new int[b];
            int[] sa = new int[b];
            String[] sn = new String[b];
            String[] sg = new String[b];
            String[] shl = new String[b];
            String[] sc = new String[b];
            int[] sd = new int[b];
            int[] f = new int[b];
            int[] df = new int[b];
            
            int[] status = new int[b];
            //starting

            System.out.println("STUDENT MODULE");
            System.out.println("_________________________________________________________________________________________________________");
s.nextLine();
            for (int i = 0; i < sc.length; i++) {
                
                System.out.println("Enter student name:" + (i + 1));
                sn[i] = s.nextLine();

                System.out.println("Enter student id:" + (i + 1));
                sid[i] = s.nextInt();
                System.out.println("Enter student age:" + (i + 1));
                sa[i] = s.nextInt();
                s.nextLine();
                System.out.println("Enter student Gender:" + (i + 1));
                sg[i] = s.nextLine();

                System.out.println("student home location name:" + (i + 1));
                shl[i] = s.nextLine();
                System.out.println("Enter student contact:" + (i + 1));
                sc[i] = s.nextLine();
                System.out.println("enter total distance in kms:" + (i + 1));
                sd[i] = s.nextInt();
                s.nextLine();
                f[i] = fare(sd[i]);
                df[i] = discount(f[i]);
                if (df[i] == f[i]) {
                    status[i] = 0;

                    
                } else {
                    status[i] = 1;
                    
                }

            }

            System.out.println("_________________________________________________________________________________________________________");
            System.out.println("Name:          age:            id:            Gender:         location:       Contact:         Distance:        Fare:         status of advance fee:        Discounted fare:");
            for (int i = 0; i < sc.length; i++) {
                System.out.printf("%-15s %-15d %-15d %-15s %-15s %-15s %-15d %-25d %-25d %-25d\n", sn[i], sa[i], sid[i], sg[i], shl[i], sc[i], sd[i], f[i], status[i], df[i]);
            }
        System.out.println("_________________________________________________________________________________________________________");
            System.out.println("if you want to see any individual record press S");
            char c = s.next().charAt(0);
            while (c == 's' || c == 'S') {
                System.out.println("if you want to see any individual record enter student id");
                int ssid = s.nextInt();
                for (int i = 0; i < sc.length; i++) {

                    if (sid[i] == ssid) {
                        System.out.println("Name:          age:            id:            Gender:         location:       Contact:         Distance:        Fare:         status of advance fee:        Discounted fare:");
                        System.out.printf("%-15s %-15d %-15d %-15s %-15s %-15s %-15d %-25d %-25d %-25d\n", sn[i], sa[i], sid[i], sg[i], shl[i], sc[i], sd[i], f[i], status[i], df[i]);
                    }

                }
                System.out.println("if you want to see any other record press 's' again");
                c = s.next().charAt(0);

            }
        }
    }

    //discount function
    public static int discount(int f) {
        Scanner s = new Scanner(System.in);
        int df;
        System.out.println("student has paid advance fee press 'y' if not press 'n'");
        char dc = s.next().charAt(0);

        if (dc == 'y' || dc == 'Y') {

            df = f - 500;
            return df;
        } else {
            df = f;
        }
        return df;

    }
    //tax function

    public static double tax(double s) {
        double st;

        if (s > 50000) {
            st = (s - s * 0.05);
            return st;
        } else {
            st = s;
            return st;
        }

    }
    //fare function

    public static int fare(int sd) {
        int f;
        if (sd <= 30) {
            f = 100 * sd;
            return f;
        } else {
            f = 140 * sd;
            return f;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter y to see the menu ");
        char c = s.next().charAt(0);

        while (c == 'y' || c == 'Y') {
            System.out.println("ENTER NUMBER BETWEEEN 1 AND 4 ACCORDING TO MENU WHRE YOU WANT TO STORE DATA");
            System.out.println("...ENTER 1 FOR BUS MODULE...");
            System.out.println("...2 FOR ROUTE MODULE...");

            System.out.println("...3 FOR DRIVER MODULE...");
            System.out.println("...4 FOR STUDENT MODULE...");
            System.out.println("enter number...");
            int number = s.nextInt();
            switch (number) {
                case 1:
                    System.out.println("if you want to add a record press 'A'");
                    char bch = s.next().charAt(0);
                    if (bch == 'a' || bch == 'A') {
                        bus();
                    } else {
                        System.out.println("invalid choice");

                    }

                    break;

                case 2:

                    System.out.println("if you want to add a record press 'A'");
                    char rch = s.next().charAt(0);
                    if (rch == 'a' || rch == 'A') {
                        route();
                    } else {
                        System.out.println("invalid choice");

                    }

                    break;

                case 3:

                    System.out.println("if you want to add a record press 'A'");
                    char dch = s.next().charAt(0);
                    if (dch == 'a' || dch == 'A') {
                        driver();
                    } else {
                        System.out.println("invalid choice");

                    }

                    break;

                case 4:
                    System.out.println("if you want to add a record press 'A'");
                    char sch = s.next().charAt(0);
                    if (sch == 'a' || sch == 'A') {
                        student();
                    } else {
                        System.out.println("invalid choice");

                    }
                    break;

                default:

                    System.out.println("you have made invalid choice");
            }

            System.out.println("IF YOU WANT TO READ THE MENU AGAIN SO FOLLOW INSTRUCTION GIVEN BELOW...");

            System.out.println("enter y to see the menu again or any other button to exit program");
            c = s.next().charAt(0);

        }

        System.out.println("program has ended! YOU DIDN'T SELECTED Y TO SEE THE MENU AGAIN");
    }

}
