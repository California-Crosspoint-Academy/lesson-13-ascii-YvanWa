//Yvan Wang
public class exercise {
    public static void main(String[] args) {
        // 1    65
        System.out.println((int)'A'); 

        // 2    90
        System.out.println((int)'Z'); 

        // 3    97
        System.out.println((int)'a'); 

        // 4    122
        System.out.println((int)'z'); 

        // 5    26
        System.out.println(26); 

        // 6    48
        System.out.println((int)'0'); 

        // 7    57
        System.out.println((int)'9'); 

        // 8    print upper case letter from A to Z
        // output :ABCDEFGHIJKLMNOPQRSTUVWXYZ
        for (int j = 97; j <= 122; j++) {
            char c = (char)(j - 32);
            System.out.print(c);
        }
        System.out.println();

        // 9 covert the upper case to lower case
        // output: alfred e. neuman
        String s = "Alfred E. Neuman";
        char ch;
        for (int x = 0; x < s.length(); x++) {
            ch = s.charAt(x);
            if ((ch <= 90) && (ch >= 65))
                ch = (char)(ch + 32);
            System.out.print(ch);
        }
        System.out.println();

        // 10 
        char a = 'B';
        String s=""+a;
        System.out.println(s);

        // 11  
        String p = "Q";
        char b=p.charAt(0)
        System.out.println(b);

        // 12    Not legal

        // 13  legal
        char ch13 = 'V';
        char x13 = (char)(ch13 + 56);
        System.out.println(x13);

        // 14   Not legal

        // 15    69
        char k = 'B';
        System.out.println(k + 3); 

        // 16    E
        System.out.println((char)(k + 3)); 

        // 17    M
        char boy = 'm';
        char cv = Character.toUpperCase(boy);
        System.out.printlnd(cv);

        // 18    m
        cv Character.toLowerCase(boy);
        System.out.println(cv);

        // 19   true
        char bv = '8';
        System.out.println(Character.isDigit(bv));

        // 20   false
        System.out.println(Character.isLetter(bv));

        // 21    false
        System.out.println(Character.isUpperCase(bv));

        // 22    true
        System.out.println(Character.isLetterOrDigit(bv));

        // 23    false
        System.out.println(Character.isLowerCase(bv));

        // 24  outputs ASCII codes of whitespace: 9, 10, 11, 12, 13, 32
        for (int j = 0; j <= 127; j++) {
            char c2 = (char)j;
            if (Character.isWhitespace(c2))
                System.out.println(j);
        }
    }
}
