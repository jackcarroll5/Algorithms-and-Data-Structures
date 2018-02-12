import java.util.Scanner;

public class TranspositionTest {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String cipherText = TranspositionEncrypt.encrypt("THISI SASEC RETME SSAGE",5);
   System.out.println("\n" + cipherText);//Expect TSRSHAESISTASEMGICEE

        String cipherText1 = TranspositionEncrypt.encrypt("TKMAX XISSO ORIGI NAL",6);
        System.out.println("\n" + cipherText1);//Expect TIIKSGMSIAONXOAXRL

        String plainText = TranspositionEncrypt.decrypt("TSRSH AESIS TASEM GICEE",5);
        System.out.println("\n" + plainText);//Expect THISISASECRETMESSAGE

        String plainText1 = TranspositionEncrypt.decrypt("TIIKS GMSIA ONXOA XRL",6);
        System.out.println("\n" + plainText1);//Expect TKMAX XISSO ORIGI NAL

   }
}
