import java.util.Scanner;

class StringPractical {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 Change Case");
        System.out.println("2 Reverse without function");
        System.out.println("3 Reverse using function");
        System.out.println("4 Compare strings");
        System.out.println("5 Insert string");
        System.out.println("6 Upper and Lower case");
        System.out.println("7 Character position");
        System.out.println("8 Palindrome");
        System.out.println("9 Word Vowel Consonant");

        int c = sc.nextInt();
        sc.nextLine();

        switch(c) {

            case 1:
                System.out.println("Enter string:");
                String s1 = sc.nextLine();
                String t="";
                for(int i=0;i<s1.length();i++){
                    char x=s1.charAt(i);
                    if(Character.isUpperCase(x))
                        t+=Character.toLowerCase(x);
                    else if(Character.isLowerCase(x))
                        t+=Character.toUpperCase(x);
                    else
                        t+=x;
                }
                System.out.println(t);
                break;

            case 2:
                System.out.println("Enter string:");
                s1 = sc.nextLine();
                String r="";
                for(int i=s1.length()-1;i>=0;i--)
                    r+=s1.charAt(i);
                System.out.println(r);
                break;

            case 3:
                System.out.println("Enter string:");
                s1 = sc.nextLine();
                System.out.println(new StringBuffer(s1).reverse());
                break;

            case 4:
                System.out.println("Enter first string:");
                String a = sc.nextLine();
                System.out.println("Enter second string:");
                String b = sc.nextLine();
                if(a.equals(b))
                    System.out.println("Equal");
                else
                    System.out.println("Not Equal");
                break;

            case 5:
                System.out.println("Enter main string:");
                s1 = sc.nextLine();
                System.out.println("Enter string to insert:");
                String s2 = sc.nextLine();
                System.out.println(s1.substring(0,s1.length()/2)+s2+s1.substring(s1.length()/2));
                break;

            case 6:
                System.out.println("Enter string:");
                s1 = sc.nextLine();
                System.out.println(s1.toUpperCase());
                System.out.println(s1.toLowerCase());
                break;

            case 7:
                System.out.println("Enter string:");
                s1 = sc.nextLine();
                System.out.println("Enter character:");
                char ch = sc.next().charAt(0);
                int p = s1.indexOf(ch);
                if(p!=-1)
                    System.out.println(p+1);
                else
                    System.out.println("Not Found");
                break;

            case 8:
                System.out.println("Enter string:");
                s1 = sc.nextLine();
                String cl=s1.replaceAll("\\s+","").toLowerCase();
                String rr=new StringBuffer(cl).reverse().toString();
                if(cl.equals(rr))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;

            case 9:
                System.out.println("Enter string:");
                s1 = sc.nextLine();
                int w=s1.trim().split("\\s+").length;
                int v=0,co=0;
                for(int i=0;i<s1.length();i++){
                    char y=Character.toLowerCase(s1.charAt(i));
                    if(y>='a'&&y<='z'){
                        if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
                            v++;
                        else
                            co++;
                    }
                }
                System.out.println("Words:"+w);
                System.out.println("Vowels:"+v);
                System.out.println("Consonants:"+co);
                break;
        }

        sc.close();
    }
}