
public class TranspositionTest {
    public static void main(String[] args) {

    String cipherText = TranspositionEncrypt.encrypt("THISI SASEC RETME SSAGE",5);
   System.out.println("\n" + cipherText);//Expect TSRSHAESISTASEMGICEE

        int ciphText = TranspositionEncrypt.calcNumRows("THISISASECRETMESSAGE",5);
        System.out.println("The number of rows calculated is " + ciphText);//4

        String ci = TranspositionEncrypt.encrypt("SUMMER TIME",4);//Expected = SEMUREMTXMIX
        System.out.println("\n" + ci);

        System.out.println(TranspositionEncrypt.calcNumRows("SUMMERTIME",4));//3

        String cipherX = TranspositionEncrypt.encrypt("SUMMER TIME",5);
        System.out.println("\n" + cipherX);//Expected = SRUTMIMMEE

        System.out.println(TranspositionEncrypt.calcNumRows("SUMMERTIME",5));//2

        String cipherText1 = TranspositionEncrypt.encrypt("TKMAX XISSO ORIGI NAL",5);
        System.out.println("\n\n" + cipherText1);//Expect TIIKSGMSIAONXOAXRL
        System.out.println(TranspositionEncrypt.calcNumRows("TKMAXXISSOORIGINAL",5));//4

         String cip = TranspositionEncrypt.encrypt("THESI MPLES TPOSS IBLET RANSP OSITI ONS",5);
        System.out.println("\n\n" + cip);
        System.out.println(TranspositionEncrypt.calcNumRows("THESIMPLESTPOSSIBLETRANSPOSITIONS",5));//7

        String plainText = TranspositionEncrypt.decrypt("TSRSH AESIS TASEM GICEE",5);
        System.out.println("\n" + plainText);//Expect THISISASECRETMESSAGE

        String plainText1 = TranspositionEncrypt.decrypt("TIIKS GMSIA ONXOA XRL",6);
        System.out.println("\n" + plainText1);//Expect TKMAXXISSOORIGINAL

        String cipher = TranspositionEncrypt.encryptCaesar("SUPER MARIO",1);
        System.out.println("\nEncrypted Cipher Text: " + cipher);//Expected = TVQFSNBSJP

        String ciph = TranspositionEncrypt.encryptCaesar("THISI SASEC RETME SSAGE",3);
        System.out.println("\nEncrypted Cipher Text: " + ciph);//Expected = TVQFSNBSJP

        String simpleSub = TranspositionEncrypt.encryptSimpleSubstitution("DAD ROCK","RAHJMYUWKXNFQGEBOPZSDCTVLI");
        System.out.println("\n\nEncrypted Text: " + simpleSub);//JRJPEHN

        String simpleSub1 = TranspositionEncrypt.encryptSimpleSubstitutionAlt("IM MARY POPPINS YALL","RAHJMYUWKXNFQGEBOPZSDCTVLI");
        System.out.println("\nEncrypted Text: " + simpleSub1);//KQQRPLBEBBKGZLRFF
   }
}
