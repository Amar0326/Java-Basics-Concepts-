public class StringLengthCalculator {
    public static void main(String[] args) {
//       String Length
         String Name="AmarJadhav";
//        No Need To Use "new" Key word in String
//        String name = new String("AmarJadhav");
        System.out.println(Name.length());

//      Join Two String
        String name1="Amar";
        String name2="Jadhav";
        String name3=name1+ " Vasudev " +name2;
        System.out.println(name3);

        // charAt
        String name="Amar";
        System.out.println(name.charAt(0)); // Java Is '0' Index Language
        System.out.println(name.length());

        // Replace
        String name10="Amar";
        String name20 = name.replace('a','b');
        System.out.println(name20);
        System.out.println(name10);

        //Substring
        String name100= "AmarAndAkash";
        System.out.println(name100.substring(0,8)); //Last Digit Will Be Not Execute
    }
}
