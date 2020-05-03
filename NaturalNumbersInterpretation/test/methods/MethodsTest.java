package methods;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Natasa
 */
public class MethodsTest {

    public MethodsTest() {
    }

    @Test
    public void testStartProgram() {
//            System.out.println("startProgram");
//     
//            Methods.startProgram();
        //        // TODO review the generated test code and remove the default call to fail.
        //        fail("The test case is a prototype.");
    }

    /**
     * Test of phoneNumberValidation method, of class Methods.
     */
    @Test
    public void testPhoneNumberValidation() {
        System.out.println("phoneNumberValidation: Correct homephone with 10 digits");
        String phoneNumber = "2102812030";
        int expResult = 1;
        int result = Methods.phoneNumberValidation(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation2: Correct mobile phone with 10 digits");
        String phoneNumber2 = "6948134409";
        int expResult2 = 1;
        int result2 = Methods.phoneNumberValidation(phoneNumber2);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation3: Wrong home phone(shorter than 10 digits)");
        String phoneNumber3 = "25010";
        int expResult3 = 0;
        int result3 = Methods.phoneNumberValidation(phoneNumber3);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation4: Wrong home phone(bigger than 10 digits)");
        String phoneNumber4 = "2501054646546546";
        int expResult4 = 0;
        int result4 = Methods.phoneNumberValidation(phoneNumber4);
        assertEquals(expResult4, result4);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation5: Wrong mobile phone(shorter than 10 digits)");
        String phoneNumber5 = "6948134";
        int expResult5 = 0;
        int result5 = Methods.phoneNumberValidation(phoneNumber5);
        assertEquals(expResult5, result5);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation6: Wrong mobile phone(bigger than 10 digits)");
        String phoneNumber6 = "69481344099722";
        int expResult6 = 0;
        int result6 = Methods.phoneNumberValidation(phoneNumber6);
        assertEquals(expResult6, result6);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation7: Wrong home phone(does not start with 2)");
        String phoneNumber7 = "1234567899";
        int expResult7 = 0;
        int result7 = Methods.phoneNumberValidation(phoneNumber7);
        assertEquals(expResult7, result7);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation8: Wrong mobile phone(does not start with 6)");
        String phoneNumber8 = "1955521485";
        int expResult8 = 0;
        int result8 = Methods.phoneNumberValidation(phoneNumber8);
        assertEquals(expResult8, result8);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation8: Wrong mobile phone(second number is not 9)");
        String phoneNumber9 = "6755521482";
        int expResult9 = 0;
        int result9 = Methods.phoneNumberValidation(phoneNumber9);
        assertEquals(expResult9, result9);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation9: Correct homephone with 14 digits");
        String phoneNumber10 = "00302102812030";
        int expResult10 = 1;
        int result10 = Methods.phoneNumberValidation(phoneNumber10);
        assertEquals(expResult10, result10);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation10: Correct mobile phone with 14 digits");
        String phoneNumber11 = "00306948134409";
        int expResult11 = 1;
        int result11 = Methods.phoneNumberValidation(phoneNumber11);
        assertEquals(expResult11, result11);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation11: Wrong home phone(shorter than 14 digits)");
        String phoneNumber12 = "003021055";
        int expResult12 = 0;
        int result12 = Methods.phoneNumberValidation(phoneNumber12);
        assertEquals(expResult12, result12);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation12: Wrong home phone(bigger than 14 digits)");
        String phoneNumber13 = "00302154646546456465";
        int expResult13 = 0;
        int result13 = Methods.phoneNumberValidation(phoneNumber13);
        assertEquals(expResult13, result13);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation13: Wrong mobile phone(shorter than 14 digits)");
        String phoneNumber14 = "0030694813";
        int expResult14 = 0;
        int result14 = Methods.phoneNumberValidation(phoneNumber14);
        assertEquals(expResult14, result14);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation14: Wrong mobile phone(bigger than 14 digits)");
        String phoneNumber15 = "003069481344099722";
        int expResult15 = 0;
        int result15 = Methods.phoneNumberValidation(phoneNumber15);
        assertEquals(expResult15, result15);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation15: Wrong home phone(does not start with 00302)");
        String phoneNumber16 = "00301234567899";
        int expResult16 = 0;
        int result16 = Methods.phoneNumberValidation(phoneNumber16);
        assertEquals(expResult16, result16);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation16: Wrong mobile phone(does not start with 00306)");
        String phoneNumber17 = "00301955521485";
        int expResult17 = 0;
        int result17 = Methods.phoneNumberValidation(phoneNumber17);
        assertEquals(expResult17, result17);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("phoneNumberValidation17: Wrong mobile phone(fifth number is not 9)");
        String phoneNumber18 = "00306755521482";
        int expResult18 = 0;
        int result18 = Methods.phoneNumberValidation(phoneNumber18);
        assertEquals(expResult18, result18);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

    }
}
