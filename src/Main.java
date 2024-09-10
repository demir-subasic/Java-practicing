import java.awt.*;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);

        //Rad sa tekstom
//        String name;
//        System.out.println("May i know your name");
//        name = s.nextLine();
//        System.out.println("Welcome " + name);
        // ---------------------

        //Rad sa brojevima1
//        int a,c,b;
//        System.out.println("Enter 2 num");
//        a = s.nextInt();
//        b = s.nextInt();
//        c = a+b;
//        System.out.println("sum is " + c);
        // ---------------------


        // Ovo je da ispisemo celu recenicu
//        Scanner sc=new Scanner(System.in);
//        String x = sc.nextLine();
//        System.out.println(x);
        // ---------------------


        // useRadix za pisanje binarninh brojeva koji se pretvaraju u normalne, postoji radix (2,8,10,16)
//        Scanner sc=new Scanner(System.in);
//        sc.useRadix(2);
//        int x = sc.nextInt();
//        System.out.println(x);
        //---------------------



        //RAD SA VARIJABLAMA

//        byte b = 5;
//        short s = 300;
//        int i=100;
//        float f=25.3f;
//        char c='A';
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(f);
//        System.out.println(c);
        //----------------------



        // LITERALS

//        byte b=15;
//        System.out.println(b);
//        float f = 2.5f;
//        System.out.println(f);
//        long l = 9999999999l;
//        System.out.println(l);

        // za lakse citanje long l=999_999_999; isto ce se prikazati kao 999999999
        //-----------------------



        //Pretvaranje normalnih brojeva u binarne
//        int x = 5;
//        System.out.println(Integer.toBinaryString(x));
        //-----------------------



        // OPERATORI U JAVI
//        +,-,*,/,%
//        i++, i--, ++i, --i;

//        int a = 14, b=5;
//        float j = (float)a/b; //ako zelimo float rezultat moramo upisati u zagradi float pre toga
//        int c = a%b;
//        System.out.println(c);
//        System.out.println(j);

//        byte a=10;
//        short b=15;
//        int c=a+b;
//        System.out.println(c);
//        b+s = i (integer)
//        i + i = i (integer)


//         char c = 40;
//         int i = 30;
//         int b = c+i;
//         System.out.println(b); // rezultat je 70, nekim razlogom se sabiraju


        //ZADATAK - racunanje povrsine trougla preko visine i jedne od stranica
//        float base, height, area;
//        System.out.println("Entera base and Height");
//        Scanner sc= new Scanner(System.in);
//        base=sc.nextFloat();
//        height=sc.nextFloat();
//        area=base*height/2;
//        System.out.println("Area of a Triangle is " + area);




        //ZADATAK - Obim kvadrata
//        Scanner sc=new Scanner(System.in);
//        int a,b,c;
//        double r1,r2;
//        System.out.println("Enter values of a,b and c");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
//        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
//        System.out.println("root are "+r1+" "+r2);

        // ------------------------------------



        //INKREMENTI I DEKREMENTI
//        int x = 5,y;
//        y= x++;
//        System.out.println(y); //ovde je x=5 jer se jos nije povecalo
//        y=x;
//        System.out.println(y); //ovde je x=6 jer se ranije uvecao


//        char a='A';
//        ++a;
//        System.out.println(a);

        // ---------------------------------


        //BITWISE OPERATORS
//          &  - AND // 00-0, 01-0, 10-0, 11-1
//          |  - OR // 00-0,  01-1, 10-1, 11-1
//          ~  - NOT
//          ^ - XOR //ako je paran broj onda je 0 ako je neparan broj onda je 1 - 00 daju 0, 10 daju 1

        // ------------------------------------




        // VISE NACINA PRINTOVANJA U JAVI I STA ONI ZNACE
//        System.out.println("Hello World"); //ispisuje u novoj liniji svaki novi print
//
//        System.out.print("Hello");
//        System.out.print("World"); //ispisuje vise printova u jednoj liniji
//
//        int age = 24;
//        System.out.printf("I am %d years old. \n", age); // ispisivanje kao u jeziku C, gde se pre definise vrednost
//
//        double pi = 3.14159;
//        System.out.format("Pi is %.2f", pi); //zaokruzice pi na dve  decimale

        // ----------------------------


        // STRINGOVI
//        char c[] = {'A', 'B', 'C'};
//        String str1 = new String(c);
//
//        String str2 = new String("Java"); // ovde se kreira novi objekat i to 2, to su pool i heap
//        System.out.println(str2);
//
//        String str5 = "Java";
//        String str6 = "Java"; // dodavanje novih varijabli sa istom vrednoscu ce se odraziti na isi objekat i idu oba u pool


//        char c[] = {'h', 'e','l', 'l','o'};
//        String str9 = new String(c,1,3); // ovo znaci da krece 1.indexa i ispisuje 3 indeksa
//        System.out.println(str9);

        //STRING METODE
//        String str = "Welcome";
//        String res = str.toLowerCase();

//        - `charAt(int index)`
//        - `contains(CharSequence s)`
//        - `indexOf(String str)`
//        - `lastIndexOf(String str)`
//        - `startsWith(String prefix)`
//        - `endsWith(String suffix)`
//        - `substring(int beginIndex)`
//        - `substring(int beginIndex, int endIndex)`
//        - `concat(String str)`
//        - `replace(char oldChar, char newChar)`
//        - `replaceAll(String regex, String replacement)`
//        - `replaceFirst(String regex, String replacement)`
//        - `toLowerCase()`
//        - `toUpperCase()`
//        - `trim()`
//        - `strip()`
//        - `stripLeading()`
//        - `stripTrailing()`
//        - `equals(Object obj)`
//        - `equalsIgnoreCase(String anotherString)`
//        - `compareTo(String anotherString)`
//        - `compareToIgnoreCase(String str)`
//        - `isEmpty()`
//        - `isBlank()`
//        - `length()`
//        - `matches(String regex)`
//        - `getBytes()`
//        - `toCharArray()`
//        - `valueOf(int i)`
//        - `split(String regex)`
//        - `split(String regex, int limit)`

        // --------------------------------------

        // REGULAR EXPRESIONS - REGEX
//        String str1 = "k1";
//        System.out.println(str1.matches(("[a-z][0-9]")));
//        //uglavnom se koristi da uporedimo da li se nesto nalazi u necemu, npr sifre

//        -Meta characters-
//        radi se isto sa .matches
//            \d - digits
//            \D - not digits
//            \s - space
//            \S - not space
//            \w - alphabets or digits
//            \W - neither alphabet or digit

        //Quantifiers
//        radi se isto sa .matches
//          * - 0 or more time
//          + - one or more
//          ? - 0 or 1 time
//         {X} - X times
//         {X,Y} - Bewteen X and Y time\

//        String str1 = "abccb";
//        System.out.println(str1.matches("[abc] {3,7}")); // proverava da li abc i da li ima od 3 do 7 karaktera i to je TRUE u ovom slucaju
        // -------------------------------------



        // CONDITIONAL STATEMENTS

//        Scanner scan=new Scanner(System.in);
//
//        System.out.println("Enter a URL");
//        String url=scan.nextLine();
//
//        String protocol=url.substring(0, url.indexOf(":"));
//
//        if(protocol.equals("http"))
//            System.out.println("Hypertext Transfer Protocol");
//        else if(protocol.equals("ftp"))
//            System.out.println("File Transfer Protocol");

        // ----------------------------------

        // SWITCH CASE
//        String str="2";
//
//        switch(str)
//        {
//            case "1": System.out.println("One");
//                break;
//            case "2": System.out.println("Two");
//                break;
//            case "3": System.out.println("Three");
//                break;
//            default : System.out.println("Invalid");
//        }
        // ------------------------------




        // LOOPS

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n=sc.nextInt();
//        long fact=1;
//        for(int i=1;i<=n;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println("Factorial is "+fact);


        // ovaj zadatak ce ceo broj podeliti u pojedinacne brojeve
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n=scan.nextInt();
//        int r;
//        while(n>0)
//        {
//            r=n%10;
//            n=n/10;
//            System.out.println(r);
//        }
//        System.out.println(n);



        //ovaj zadatak ce ddeliti ceo int broj dok ne dodje do nule
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n=scan.nextInt();
//        int count=0;
//        while(n>0)
//        {
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);


        // ovo je Arstrongov broj
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n=scan.nextInt();
//        int m=n;
//        int sum=0;
//        int r;
//        while(n>0)
//        {
//            r=n%10;
//            n=n/10;
//            sum=sum+r*r*r;
//        }
//        if(sum==m)
//            System.out.println("Its a Armstrong Number");
//        else
//            System.out.println("Its not an Armsttrong Number");




        // ovo okrece broj i ispisuje ga suprotno - 257 = 752
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = scan.nextInt();
//        int rev=0,r;
//        while(n>0){
//            r=n%10;
//            rev=rev*10+r;
//            n/=10;
//        }
//        System.out.println("Reverse a number " + rev);



        // Aritmeticka progresija- gde unosimo 3 broja(pocetni, koliko cemo uvecati i koliko puta ce se to desiti)
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Program to print AP Series");
//        System.out.println("Enter a, d and n");
//        int a=sc.nextInt();
//        int d=sc.nextInt();
//        int n=sc.nextInt();
//        int term=a;
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(term+",");
//            term=term+d;
//        }



        //Fibonacijev niz (gde je jedan broj zbir prethodna 2 broja)
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Program to Fibonacci Series");
//        System.out.println("Enter number of Terms");
//        int n=sc.nextInt();
//        int a=0,b=1,c;
//        System.out.print(a+","+b+",");
//        for(int i=0;i<n-2;i++)
//        {
//            c=a+b;
//            System.out.print(c+",");
//            a=b;
//            b=c;
//        }



        // Nested loops - matrice
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                System.out.println(j+" ");
//            }
//            System.out.println("");
//        }



//        int count=0;
//
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                count++;
//                System.out.format("%02d ",count);
//            }
//            System.out.println("");
//        }



//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i+j>5)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println("");
//        }

        //---------------------------------------



        // ARRAYS

//        int A[]=new int [5]; // ovako je defaultna vrednost niza 0 0 0 0 0
//        A[0] = 15; // ovo zadajemo da je nulti indeks jednako 15
//
//        int B[] = {1,2,3,4,5};
//        System.out.println(B[1]);

        //ovo ce ispisati indekse niza
//        for (int i=0; i<B.length; i++) {
//            System.out.println(i);
//        }

        //ovo ce ispisati indekse niza od nazad
//        for (int i=B.length-1; i>=0; i--){
//            System.out.println(B[i]);
//        }

        // ovo je foreach i ona radi tako sto ce x biti svaki clan od B niza
//        for(int x : B){
//            System.out.println(x);
//        }



        //ovde smo sabrali sve brojeve niza
//        int A[] = {3,9,7,8,12,5,15,5,4,10};
//        int sum = 0;
//        for (int i=0; i<A.length; i++) {
//            sum = sum+A[i];
//        }
//        System.out.println("Sum is "+ sum);

        //samo drugi nacin prethodnog zadataka preko foreach pretlje
//        int sum = 0;
//        for (int x:A) {
//            sum = sum + x;
//        }
//        System.out.println(sum);


        // ovde trazimo element u nizu
//        Scanner sc=new Scanner(System.in);
//        int A[] = {3,9,7,8,12,5,15,5,4,10};
//        int key;
//        System.out.println("Enter a key");
//        key=sc.nextInt();
//        for (int i = 0; i<A.length; i++){
//            if(key == A[i]){
//                System.out.println("Element found at: "+i);
//                System.exit(0); // OVO KUCAMO KADA ZELIMO DA IZADJEMO IZ PETLJE
//            }
//        }
//        System.out.println("Element not found");




        //ovde trazimo drugi najveci broj
//        int A[] = {3,9,7,8,12,5,15,5,4,10};
//        int max1,max2;
//        max1=max2=A[0];
//        for(int i =0; i<A.length; i++){
//            if(A[i]>max1){
//                max2=max1;
//                max1=A[i];
//            }
//            else if (A[i]>max2){
//                max2 = A[i];
//            }
//        }
//        System.out.println("Second largest element is " + max2);




        // rotacija niza tako sto svaki broj pomeramo za jedan na levo
//        int A[] = {3,9,7,8,12,5,15,5,4,10};
//        for (int x:A)
//            System.out.println(x+",");
//        System.out.println("");
//
//        int temp = A[0];
//        for (int i =1; i<A.length; i++){
//            A[i-1]=A[i];
//        }
//        A[A.length-1]=temp;
//
//        for (int x:A)
//            System.out.println(x+",");
//        System.out.println("");



        // ovo je ako zelimo da umetnemo neki broj na neku poziciju / broj 20 na indeks 2
//        int A[]=new int[10];
//        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
//        int n=6;
//
//        int x = 20;
//        int index = 2;
//        for(int i =n; i>index; i--){
//            A[i]=A[i-1];
//            A[index]=x;
//        }
//        for(int i = 0; i<n; i++){
//            System.out.println(A[i]+",");
//            System.out.println("");
//        }

        // --------------------------------



        // 2D ARRAYS - izgleda kao matrica i kreira redove (i) i kolone (j)


//        int A[][] = new int [3][4];
//        int A[][] = {{1,2,3,4}, {2,4,6,8}, {3,5,7,9}};
//        for (int i =0; i< A.length; i++){ // u ovoj liniji pocetak reda je vertikalno
//            for(int j =0; j<A[0].length; j++){ // u ovoj liniji pocetak redaa je horizontalno
//                System.out.println(A[i][j]); //ovo ce ispisati samo prvu liniju
//            }
//            System.out.println("\n"); // ovo ce ispisati novi red
//        }


        // Jagged Array

//        int A [][];
//        A=new int[3][];
//        A[0]=new int[2];
//        A[1]=new int[4];
//        A[2]=new int[3];
//        for(int i=0; i<A.length;i++){
//            for(int j=0;j<A[i].length;j++){
//                System.out.print(A[i][j]+" ");
//            }
//            System.out.println("");
//        }
//      00
//      0000
//      000
        //ovako izgleda jagged aray koji je prikazan iznad



        //sabiranje dve matrice
//        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
//        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
//        int C[][]= new int [3][3];
//        for (int i =0; i<A.length; i++){
//            for (int j = 0; j<A[0].length; j++){
//                C[i][j] = A[i][j] + B[i][j];
//            }
//        }
//        for (int x[]:C) {
//            for(int y:x){
//                System.out.print(y+" ");
//            }
//            System.out.println("");
//        }



        //sortiranje niza po abecedi
//        String arr[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
//        java.util.Arrays.sort(arr);
//        for(String x:arr)
//            System.out.println(x);
















































    }
}