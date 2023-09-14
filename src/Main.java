public class Main
{
    public static void main(String[] args)
    {
        //setting ints because user inputs are not in this lab
        int intOperandA = 8;
        int intOperandB = 3;

        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0; //int leftover

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);



        //setting doubles because user inputs are not in this lab
        double doubleOperandA = 8.25;
        double doubleOperandB = 3.57;

        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);



        int familyMembers = 7;
        boolean isRaining = false;
        double pricePerGallon = 2.69;
        int favNum = 4;
        double shoeSize = 8;
        String birthMonth = "May";
        int birthMonthNum = 5;
        String fullName = "Zoey Rizor";

        System.out.println("Family Members: " + familyMembers);
        System.out.println("It is raining: " + isRaining);
        System.out.println("Price of gas: " + pricePerGallon);
        System.out.println("Favorite number: " + favNum);
        System.out.println("Shoe Size: " + shoeSize);
        System.out.println("Birth month: " + birthMonth);
        System.out.println("Birth month: " + birthMonthNum);
        System.out.println("Full Name: " + fullName);
    }
}