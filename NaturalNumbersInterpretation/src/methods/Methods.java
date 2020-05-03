package methods;

import java.util.Scanner;

/**
 *
 * @author Natasa
 */
public class Methods {

    public static void startProgram() {

        do {
            //Input from user
            Scanner in = new Scanner(System.in);
            System.out.println("Enter phone number: ");

            String phoneNumber = in.nextLine();
            //Replaces one or more spaces entered by user
            phoneNumber = phoneNumber.replaceAll("\\s+", "");

            //Convert String to long to see if it contains only digits.
            try {
                Long.parseLong(phoneNumber);

                phoneNumberValidation(phoneNumber);

                break;

            } //If it does not contain digits, ask for number again
            catch (NumberFormatException e) {
                System.out.println("The phone number must contain digits only.");
                System.out.println("Please try again.");

                continue;
            }

        } while (true);

    }

    static int phoneNumberValidation(String phoneNumber) {
        //Split input of user into separate digits and store in arrays for all 
        //different outputs
        String[] phoneNumberArray = phoneNumber.split("");
        String[] phoneNumberArray0 = phoneNumber.split("");
        String[] phoneNumberArray1 = phoneNumber.split("");
        String[] phoneNumberArray2 = phoneNumber.split("");
        String[] phoneNumberArray3 = phoneNumber.split("");
        String[] phoneNumberArray4 = phoneNumber.split("");
        String[] phoneNumberArray5 = phoneNumber.split("");
        String[] phoneNumberArray6 = phoneNumber.split("");
        String[] phoneNumberArray7 = phoneNumber.split("");
        String[] phoneNumberArray8 = phoneNumber.split("");
        String[] phoneNumberArray9 = phoneNumber.split("");
        String[] phoneNumberArray10 = phoneNumber.split("");
        String[] phoneNumberArray11 = phoneNumber.split("");
        String[] phoneNumberArray12 = phoneNumber.split("");
        String[] phoneNumberArray13 = phoneNumber.split("");
        String[] phoneNumberArray14 = phoneNumber.split("");
        String[] phoneNumberArray15 = phoneNumber.split("");
        String[] phoneNumberArray16 = phoneNumber.split("");
        String[] phoneNumberArray17 = phoneNumber.split("");

        //Counter for Interpratations
        int counter = 0;
        //Validation of number with 10 digits - First digit must be 2 
        if (phoneNumberArray.length == 10 && (phoneNumberArray[0].equals("2"))) {
            System.out.println("Possible interpretations: ");
            System.out.println("Interpretation " + ++counter + ": ");
            System.out.println(phoneNumber + " [phone number: VALID]");
            System.out.println("----------");

            //Check if there is a zero in array from position 1 onwards
            //If not, add a zero to next to each number in the position mentioned
            //(if the following number is anything else but zero) e.g. 69 becomes 609
            if (!(phoneNumberArray0[1].equals("0")) && !(phoneNumberArray0[2].equals("0"))) {
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("1", "10");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("2", "20");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("3", "30");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("4", "40");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("5", "50");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("6", "60");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("7", "70");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("8", "80");
                phoneNumberArray0[1] = phoneNumberArray0[1].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray0) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }

            if (!(phoneNumberArray1[2].equals("0")) && !(phoneNumberArray1[3].equals("0"))) {
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("1", "10");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("2", "20");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("3", "30");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("4", "40");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("5", "50");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("6", "60");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("7", "70");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("8", "80");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray1) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray2[3].equals("0")) && !(phoneNumberArray2[4].equals("0"))) {
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("1", "10");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("2", "20");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("3", "30");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("4", "40");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("5", "50");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("6", "60");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("7", "70");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("8", "80");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray2) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray3[4].equals("0")) && !(phoneNumberArray3[5].equals("0"))) {
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("1", "10");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("2", "20");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("3", "30");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("4", "40");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("5", "50");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("6", "60");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("7", "70");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("8", "80");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray3) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray4[5].equals("0")) && !(phoneNumberArray4[6].equals("0"))) {
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("1", "10");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("2", "20");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("3", "30");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("4", "40");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("5", "50");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("6", "60");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("7", "70");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("8", "80");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray4) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray5[6].equals("0")) && !(phoneNumberArray5[7].equals("0"))) {
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("1", "10");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("2", "20");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("3", "30");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("4", "40");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("5", "50");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("6", "60");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("7", "70");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("8", "80");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray5) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray6[7].equals("0")) && !(phoneNumberArray6[8].equals("0"))) {
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("1", "10");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("2", "20");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("3", "30");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("4", "40");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("5", "50");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("6", "60");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("7", "70");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("8", "80");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray6) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray7[8].equals("0")) && !(phoneNumberArray7[9].equals("0"))) {
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("1", "10");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("2", "20");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("3", "30");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("4", "40");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("5", "50");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("6", "60");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("7", "70");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("8", "80");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray7) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }

            //Check if there is a zero in array from position 1 onwards
            //If true, remove all zeros from array
            if (phoneNumberArray8[1].equals("0")
                    || phoneNumberArray8[2].equals("0")
                    || phoneNumberArray8[3].equals("0")
                    || phoneNumberArray8[4].equals("0")
                    || phoneNumberArray8[5].equals("0")
                    || phoneNumberArray8[6].equals("0")
                    || phoneNumberArray8[7].equals("0")
                    || phoneNumberArray8[8].equals("0")
                    || phoneNumberArray8[9].equals("0")) {

                for (int index = 1; index < phoneNumberArray9.length; index++) {
                    phoneNumberArray8[index] = phoneNumberArray9[index].replace("0", "");

                }

                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray8) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            //Check if there is a zero in array from position 1 onwards
            //If true, remove zero only from each position mentioned
            if (phoneNumberArray9[1].equals("0")) {
                phoneNumberArray9[1] = phoneNumberArray9[1].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray9) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray10[2].equals("0")) {
                phoneNumberArray10[2] = phoneNumberArray10[2].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray10) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray11[3].equals("0")) {
                phoneNumberArray11[3] = phoneNumberArray11[3].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray11) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray12[4].equals("0")) {
                phoneNumberArray12[4] = phoneNumberArray12[4].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray12) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray13[5].equals("0")) {
                phoneNumberArray13[5] = phoneNumberArray13[5].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray13) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray14[6].equals("0")) {
                phoneNumberArray14[6] = phoneNumberArray14[6].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray14) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray15[7].equals("0")) {
                phoneNumberArray15[7] = phoneNumberArray15[7].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray15) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray16[8].equals("0")) {
                phoneNumberArray16[8] = phoneNumberArray16[8].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray16) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray17[9].equals("0")) {
                phoneNumberArray17[9] = phoneNumberArray17[9].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray17) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }
            return 1; //If number has 10 digits and starts with 2, 
            // return 1 - Useful for JUnit testing

            //Validation of number with 10 digits - Two first digits must be 69  
        } else if (phoneNumberArray.length == 10
                && (phoneNumberArray[0].equals("6")
                && phoneNumberArray[1].equals("9"))) {

            System.out.println("Possible interpretations: ");
            System.out.println("Interpretation " + ++counter + ": ");
            System.out.println(phoneNumber + " [phone number: VALID]");
            System.out.println("----------");

            //Check if there is a zero in array from position 2 onwards
            //If not, add a zero to next to each number in the position mentioned
            //(if the following number is anything else but zero) e.g. 69 becomes 609
            if (!(phoneNumberArray1[2].equals("0")) && !(phoneNumberArray1[3].equals("0"))) {
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("1", "10");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("2", "20");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("3", "30");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("4", "40");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("5", "50");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("6", "60");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("7", "70");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("8", "80");
                phoneNumberArray1[2] = phoneNumberArray1[2].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray1) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray2[3].equals("0")) && !(phoneNumberArray2[4].equals("0"))) {
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("1", "10");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("2", "20");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("3", "30");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("4", "40");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("5", "50");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("6", "60");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("7", "70");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("8", "80");
                phoneNumberArray2[3] = phoneNumberArray2[3].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray2) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray3[4].equals("0")) && !(phoneNumberArray3[5].equals("0"))) {
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("1", "10");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("2", "20");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("3", "30");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("4", "40");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("5", "50");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("6", "60");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("7", "70");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("8", "80");
                phoneNumberArray3[4] = phoneNumberArray3[4].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray3) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray4[5].equals("0")) && !(phoneNumberArray4[6].equals("0"))) {
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("1", "10");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("2", "20");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("3", "30");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("4", "40");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("5", "50");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("6", "60");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("7", "70");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("8", "80");
                phoneNumberArray4[5] = phoneNumberArray4[5].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray4) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray5[6].equals("0")) && !(phoneNumberArray5[7].equals("0"))) {
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("1", "10");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("2", "20");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("3", "30");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("4", "40");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("5", "50");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("6", "60");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("7", "70");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("8", "80");
                phoneNumberArray5[6] = phoneNumberArray5[6].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray5) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray6[7].equals("0")) && !(phoneNumberArray6[8].equals("0"))) {
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("1", "10");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("2", "20");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("3", "30");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("4", "40");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("5", "50");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("6", "60");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("7", "70");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("8", "80");
                phoneNumberArray6[7] = phoneNumberArray6[7].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray6) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray7[8].equals("0")) && !(phoneNumberArray7[9].equals("0"))) {
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("1", "10");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("2", "20");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("3", "30");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("4", "40");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("5", "50");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("6", "60");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("7", "70");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("8", "80");
                phoneNumberArray7[8] = phoneNumberArray7[8].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray7) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }

            //Check if there is a zero in array from position 2 onwards
            //If true, remove all zeros from array
            if (phoneNumberArray8[2].equals("0")
                    || phoneNumberArray8[3].equals("0")
                    || phoneNumberArray8[4].equals("0")
                    || phoneNumberArray8[5].equals("0")
                    || phoneNumberArray8[6].equals("0")
                    || phoneNumberArray8[7].equals("0")
                    || phoneNumberArray8[8].equals("0")
                    || phoneNumberArray8[9].equals("0")) {

                for (int index = 2; index < phoneNumberArray9.length; index++) {
                    phoneNumberArray8[index] = phoneNumberArray9[index].replace("0", "");

                }

                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray8) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            //Check if there is a zero in array from position 2 onwards
            //If true, remove zero only from each position mentioned
            if (phoneNumberArray10[2].equals("0")) {
                phoneNumberArray10[2] = phoneNumberArray10[2].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray10) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray11[3].equals("0")) {
                phoneNumberArray11[3] = phoneNumberArray11[3].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray11) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray12[4].equals("0")) {
                phoneNumberArray12[4] = phoneNumberArray12[4].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray12) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray13[5].equals("0")) {
                phoneNumberArray13[5] = phoneNumberArray13[5].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray13) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray14[6].equals("0")) {
                phoneNumberArray14[6] = phoneNumberArray14[6].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray14) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray15[7].equals("0")) {
                phoneNumberArray15[7] = phoneNumberArray15[7].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray15) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray16[8].equals("0")) {
                phoneNumberArray16[8] = phoneNumberArray16[8].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray16) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray17[9].equals("0")) {
                phoneNumberArray17[9] = phoneNumberArray17[9].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray17) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }
            return 1; //If number has 10 digits and starts with 69, 
            // return 1 - Useful for JUnit testing

        } //Validation of number with 14 digits - Number starts with 00302
        else if (phoneNumberArray.length == 14
                && phoneNumberArray[0].equals("0")
                && phoneNumberArray[1].equals("0")
                && phoneNumberArray[2].equals("3")
                && phoneNumberArray[3].equals("0")
                && (phoneNumberArray[4].equals("2"))) {
            System.out.println("Possible interpretations: ");
            System.out.println("Interpretation " + ++counter + ": ");
            System.out.println(phoneNumber + " [phone number: VALID]");
            System.out.println("----------");

            //Check if there is a zero in array from position 5 onwards
            //If not, add a zero to next to each number in the position mentioned
            //(if the following number is anything else but zero) e.g. 69 becomes 609
            if (!(phoneNumberArray0[5].equals("0")) && !(phoneNumberArray0[6].equals("0"))) {
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("1", "10");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("2", "20");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("3", "30");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("4", "40");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("5", "50");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("6", "60");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("7", "70");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("8", "80");
                phoneNumberArray0[5] = phoneNumberArray0[5].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray0) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray1[6].equals("0")) && !(phoneNumberArray1[7].equals("0"))) {
                phoneNumberArray1[6] = phoneNumberArray15[6].replace("1", "10");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("2", "20");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("3", "30");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("4", "40");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("5", "50");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("6", "60");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("7", "70");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("8", "80");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray1) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray2[7].equals("0")) && !(phoneNumberArray2[8].equals("0"))) {
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("1", "10");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("2", "20");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("3", "30");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("4", "40");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("5", "50");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("6", "60");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("7", "70");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("8", "80");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray2) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray3[8].equals("0")) && !(phoneNumberArray3[9].equals("0"))) {
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("1", "10");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("2", "20");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("3", "30");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("4", "40");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("5", "50");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("6", "60");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("7", "70");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("8", "80");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray3) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray4[9].equals("0")) && !(phoneNumberArray4[10].equals("0"))) {
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("1", "10");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("2", "20");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("3", "30");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("4", "40");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("5", "50");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("6", "60");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("7", "70");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("8", "80");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray4) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray5[10].equals("0")) && !(phoneNumberArray5[11].equals("0"))) {
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("1", "10");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("2", "20");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("3", "30");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("4", "40");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("5", "50");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("6", "60");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("7", "70");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("8", "80");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray5) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray6[11].equals("0")) && !(phoneNumberArray6[12].equals("0"))) {
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("1", "10");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("2", "20");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("3", "30");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("4", "40");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("5", "50");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("6", "60");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("7", "70");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("8", "80");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray6) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray7[12].equals("0")) && !(phoneNumberArray6[13].equals("0"))) {
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("1", "10");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("2", "20");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("3", "30");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("4", "40");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("5", "50");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("6", "60");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("7", "70");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("8", "80");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray7) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }

            //Check if there is a zero in array from position 5 onwards
            //If true, remove all zeros from array
            if (phoneNumberArray8[5].equals("0")
                    || phoneNumberArray8[6].equals("0")
                    || phoneNumberArray8[7].equals("0")
                    || phoneNumberArray8[8].equals("0")
                    || phoneNumberArray8[9].equals("0")
                    || phoneNumberArray8[10].equals("0")
                    || phoneNumberArray8[11].equals("0")
                    || phoneNumberArray8[12].equals("0")
                    || phoneNumberArray8[13].equals("0")) {

                for (int index = 5; index < phoneNumberArray8.length; index++) {
                    phoneNumberArray8[index] = phoneNumberArray8[index].replace("0", "");

                }

                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray8) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            //Check if there is a zero in array from position 5 onwards
            //If true, remove zero only from each position mentioned
            if (phoneNumberArray9[5].equals("0")) {
                phoneNumberArray9[5] = phoneNumberArray9[5].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray9) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray10[6].equals("0")) {
                phoneNumberArray10[6] = phoneNumberArray10[6].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray10) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray11[7].equals("0")) {
                phoneNumberArray11[7] = phoneNumberArray11[7].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray11) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray12[8].equals("0")) {
                phoneNumberArray12[8] = phoneNumberArray12[8].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray12) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray13[9].equals("0")) {
                phoneNumberArray13[9] = phoneNumberArray13[9].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray13) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray14[10].equals("0")) {
                phoneNumberArray14[10] = phoneNumberArray14[10].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray14) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray15[11].equals("0")) {
                phoneNumberArray15[11] = phoneNumberArray15[11].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray15) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray16[12].equals("0")) {
                phoneNumberArray16[12] = phoneNumberArray16[12].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray16) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray17[13].equals("0")) {
                phoneNumberArray17[13] = phoneNumberArray17[13].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray17) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }
            return 1; //If number has 14 digits and starts with 00302, 
            // return 1 - Useful for JUnit testing

            //Validation of number with 14 digits - Number starts with 003069
        } else if (phoneNumberArray.length == 14
                //First digits must be 00302 or 003069
                && phoneNumberArray[0].equals("0")
                && phoneNumberArray[1].equals("0")
                && phoneNumberArray[2].equals("3")
                && phoneNumberArray[3].equals("0")
                && phoneNumberArray[4].equals("6")
                && phoneNumberArray[5].equals("9")) {
            System.out.println("Possible interpretations: ");
            System.out.println("Interpretation " + ++counter + ": ");
            System.out.println(phoneNumber + " [phone number: VALID]");
            System.out.println("----------");

            //Check if there is a zero in array from position 6 onwards
            //If not, add a zero to next to each number in the position mentioned
            //(if the following number is anything else but zero) e.g. 69 becomes 609
            if (!(phoneNumberArray1[6].equals("0")) && !(phoneNumberArray1[7].equals("0"))) {
                phoneNumberArray1[6] = phoneNumberArray15[6].replace("1", "10");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("2", "20");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("3", "30");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("4", "40");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("5", "50");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("6", "60");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("7", "70");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("8", "80");
                phoneNumberArray1[6] = phoneNumberArray1[6].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray1) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray2[7].equals("0")) && !(phoneNumberArray2[8].equals("0"))) {
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("1", "10");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("2", "20");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("3", "30");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("4", "40");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("5", "50");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("6", "60");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("7", "70");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("8", "80");
                phoneNumberArray2[7] = phoneNumberArray2[7].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray2) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray3[8].equals("0")) && !(phoneNumberArray3[9].equals("0"))) {
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("1", "10");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("2", "20");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("3", "30");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("4", "40");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("5", "50");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("6", "60");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("7", "70");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("8", "80");
                phoneNumberArray3[8] = phoneNumberArray3[8].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray3) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray4[9].equals("0")) && !(phoneNumberArray4[10].equals("0"))) {
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("1", "10");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("2", "20");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("3", "30");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("4", "40");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("5", "50");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("6", "60");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("7", "70");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("8", "80");
                phoneNumberArray4[9] = phoneNumberArray4[9].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray4) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray5[10].equals("0")) && !(phoneNumberArray5[11].equals("0"))) {
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("1", "10");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("2", "20");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("3", "30");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("4", "40");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("5", "50");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("6", "60");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("7", "70");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("8", "80");
                phoneNumberArray5[10] = phoneNumberArray5[10].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray5) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray6[11].equals("0")) && !(phoneNumberArray6[12].equals("0"))) {
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("1", "10");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("2", "20");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("3", "30");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("4", "40");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("5", "50");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("6", "60");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("7", "70");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("8", "80");
                phoneNumberArray6[11] = phoneNumberArray6[11].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray6) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }
            if (!(phoneNumberArray7[12].equals("0")) && !(phoneNumberArray6[13].equals("0"))) {
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("1", "10");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("2", "20");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("3", "30");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("4", "40");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("5", "50");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("6", "60");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("7", "70");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("8", "80");
                phoneNumberArray7[12] = phoneNumberArray7[12].replace("9", "90");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray7) {
                    System.out.print(str);
                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");

            }

            //Check if there is a zero in array from position 6 onwards
            //If true, remove all zeros from array
            if (phoneNumberArray8[6].equals("0")
                    || phoneNumberArray8[7].equals("0")
                    || phoneNumberArray8[8].equals("0")
                    || phoneNumberArray8[9].equals("0")
                    || phoneNumberArray8[10].equals("0")
                    || phoneNumberArray8[11].equals("0")
                    || phoneNumberArray8[12].equals("0")
                    || phoneNumberArray8[13].equals("0")) {

                for (int index = 6; index < phoneNumberArray8.length; index++) {
                    phoneNumberArray8[index] = phoneNumberArray8[index].replace("0", "");

                }

                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray8) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            //Check if there is a zero in array from position 6 onwards
            //If true, remove zero only from each position mentioned
            if (phoneNumberArray10[6].equals("0")) {
                phoneNumberArray10[6] = phoneNumberArray10[6].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray10) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray11[7].equals("0")) {
                phoneNumberArray11[7] = phoneNumberArray11[7].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray11) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray12[8].equals("0")) {
                phoneNumberArray12[8] = phoneNumberArray12[8].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray12) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray13[9].equals("0")) {
                phoneNumberArray13[9] = phoneNumberArray13[9].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray13) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray14[10].equals("0")) {
                phoneNumberArray14[10] = phoneNumberArray14[10].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray14) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray15[11].equals("0")) {
                phoneNumberArray15[11] = phoneNumberArray15[11].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray15) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray16[12].equals("0")) {
                phoneNumberArray16[12] = phoneNumberArray16[12].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray16) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }

            if (phoneNumberArray17[13].equals("0")) {
                phoneNumberArray17[13] = phoneNumberArray17[13].replace("0", "");
                System.out.println("Interpretation " + ++counter + ": ");
                for (String str : phoneNumberArray17) {
                    System.out.print(str);

                }
                System.out.println(" [phone number: INVALID]");
                System.out.println("----------");
            }
            return 1; //If number has 14 digits and starts with 003069, 
            // return 1 - Useful for JUnit testing
        } else {
            System.out.println(phoneNumber + " [phone number: INVALID]");
            System.out.println("----------");
            return 0; //If number is wrong, 
            // return 0 - Useful for JUnit testing
        }

    }

}
