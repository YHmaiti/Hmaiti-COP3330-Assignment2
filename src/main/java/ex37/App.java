/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex37;

import java.util.*;

public class App {

    public static void main(String[] args)  {

        // Initialize a scanner tool called scanner
        Scanner scanner = new Scanner(System.in);

        // variables declaration
        int length = 0, specialchar = 0, numbers = 0;

        // prompt the user for the password criteria
        System.out.print("What's the minimum length? ");
        length = Integer.parseInt(scanner.nextLine());
        System.out.print("How many special characters? ");
        specialchar = Integer.parseInt(scanner.nextLine());
        System.out.print("How many numbers? ");
        numbers = Integer.parseInt(scanner.nextLine());

        // call the password generator function
        int pass = passGenerator(length, specialchar, numbers);


    }

    public static int passGenerator(int len, int specialch, int numbers) {

        // Initialize a random number generating tool
        Random random = new Random();

        // create lists to store the components needed to generate the password
        // and a combination list that will store the formed combination from the other lists
        // based on the assignment's criteria
        List<String> combination = new ArrayList<String>();
        List<String> num = new ArrayList<String>();
        List<String> specialChar = new ArrayList<String>();
        List<String> upAndLowCaseLetters = new ArrayList<String>();

        // variables declaration
        String pass = "";
        String spCh = "!,@,#,$,%,^,&,*"; // store special characters
        String spChar[] = spCh.split(",");

        // store letters
        String letters = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String uplowcaselet[] = letters.split(",");

        // fill a list of numbers
        num.add("0");
        num.add("1");
        num.add("2");
        num.add("3");
        num.add("4");
        num.add("5");
        num.add("6");
        num.add("7");
        num.add("8");
        num.add("9");

        // fill a list of special characters
        specialChar = Arrays.asList(spChar);

        // fill a list of upper and lowercase letters
        upAndLowCaseLetters = Arrays.asList(uplowcaselet);

        // loop to gather randomized numbers
        for (int k = 0; k < numbers; k++) {

            combination.add(num.get(random.nextInt(num.size())));

        }

        // loop to gather randomized special characters
        for (int i = 0; i < specialch; i++) {

            combination.add(specialChar.get(random.nextInt(specialChar.size())));
        }

        // loop to gather randomized letters
        for (int j = combination.size() - 1; j < len; j++) {

            combination.add(upAndLowCaseLetters.get(random.nextInt(upAndLowCaseLetters.size())));
        }

        // randomize
        Collections.shuffle(combination);

        // gather all the elements into the pass string
        for (String s : combination)  {

            pass = pass + s;

        }

        System.out.print("Your password is " + pass);


        return 1; // return one at the end meaning successful run of the function

    }

}
