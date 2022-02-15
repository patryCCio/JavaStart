package sectors.stringbuilder.example2;

import java.util.Scanner;

public class StringsBuilder{



    public void resultString(){
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        int howWords;

        System.out.print("How much words: ");
        howWords = sc.nextInt();
        sc.nextLine();

        String[] words = new String[howWords];

        System.out.println();
        String result="";
        char helper;
        int helper2;
        int wordLength;

        for(int x=0; x<howWords; x++){
            System.out.print("Word " + (x+1) + ": ");
            words[x] = sc.nextLine();
            System.out.println();
            wordLength = words[x].length();

            helper = words[x].charAt(wordLength-1);
            builder.append(helper);
        }

        result = builder.toString();
        System.out.println("Result: " + result);
        sc.close();
    }

}
