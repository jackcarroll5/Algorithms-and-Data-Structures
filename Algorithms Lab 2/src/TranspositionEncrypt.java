public class TranspositionEncrypt
{
    public static String encrypt(String plaintext, int noColumns) {

        plaintext = plaintext.replace(" ", "");
        plaintext = plaintext.toUpperCase();

        int noOfRows = calcNumRows(plaintext, 6);


        while (plaintext.length() % noColumns != 0) {
            plaintext += "X";
        }

        String cipherText = "";

        for (int col = 0; col <= noColumns - 1; col++) {
            int index = col;

            for (int row = 0; row <= noOfRows - 1; row++) {
                cipherText += plaintext.charAt(index);
                index += noColumns;
            }
        }
        return cipherText;
    }

    public static String decrypt(String cipherText, int noColumns)
    {
        cipherText = cipherText.replace(" ","");
        cipherText = cipherText.toUpperCase();

        int noRows = calcNumRows(cipherText,6);

        while (cipherText.length() % noColumns != 0)
        {
            cipherText += "X";
        }

        String plaintext = "";

        for (int col = 0; col <= noRows - 1; col++) {
            int index = col;

            for (int row = 0; row <= noColumns - 1; row++) {
                plaintext += cipherText.charAt(index);
                index += noRows;
            }
        }
        return plaintext;
    }
   private static int calcNumRows(String s,int noColumns)
   {
       int noRows = 0;

       if (s.length() % noColumns == 0)
          noRows = s.length() / noColumns;
       else {
           noRows = (s.length() / noColumns) + 1;
       }
       return noRows;
   }


}