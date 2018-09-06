public class TranspositionEncrypt
{
    public static String encrypt(String plaintext, int noColumns) {//Row Column Transposition

        plaintext = plaintext.replace(" ", "");
        plaintext = plaintext.toUpperCase();

        /*To calcuate numRows required for plainText*/
        int noOfRows = calcNumRows(plaintext, noColumns);

        while (plaintext.length() % noColumns != 0)
        {
            plaintext += "X";
        }

        String cipherText = "";

        for (int col = 0; col <= noColumns - 1; col++)
        {
            int i = col;
            for (int row = 0; row <= noOfRows - 1; row++) {
                cipherText += plaintext.charAt(i);
                i += noColumns;
            }
        }
        return cipherText;
    }

    //s = plaintext
    /*To calcuate numRows required for plainText*/
    public static int calcNumRows(String s,int noColumns)
    {
        int noRows;

        if (s.length() % noColumns == 0)
            noRows = s.length() / noColumns;
          else
            noRows = (s.length() / noColumns) + 1;

          //noRows = plaintext / noCols

        return noRows;
    }

    public static String decrypt(String cipherText, int noColumns)
    {
        cipherText = cipherText.replace(" ","");
        cipherText = cipherText.toUpperCase();

        int noRows = calcNumRows(cipherText,noColumns);

        while (cipherText.length() % noColumns != 0)
        {
            cipherText += "X";
        }

        String plaintext = "";

        for (int col = 0; col <= noRows - 1; col++)
        {
            int i = col;
            for (int row = 0; row <= noColumns - 1; row++)
            {
                plaintext += cipherText.charAt(i);
                i += noRows;
            }
        }
        return plaintext;
    }

    public static String encryptCaesar(String plainText, int shift) {//Caesar Encryption

        plainText = plainText.replace(" ", "");//Spaces unchanged here
        plainText = plainText.toUpperCase();

        String result = "";

        for (int i = 0; i < plainText.length(); i++)
        {
            char ch = plainText.charAt(i);
            int chNum = ch - 'A';

            chNum = 'A' + ((chNum + shift) % 26);
            result += (char)chNum;
        }
        return result;
    }

    public static String encryptSimpleSubstitution(String plaintext, String mapping)
    {
        plaintext = plaintext.replace(" ", "");
        plaintext = plaintext.toUpperCase();

        String res = "";

        for (int i = 0; i < plaintext.length(); i++)
        {
            char ch = plaintext.charAt(i);

            if(Character.isLetter(ch))
            {
                ch = mapping.charAt(ch - 'A');
            }
            res += ch;
        }
        return res;
    }

    public static String encryptSimpleSubstitutionAlt(String plaintext, String mapping)
    {
        plaintext = plaintext.replace(" ", "");
        plaintext = plaintext.toUpperCase();

        String res = "";

        for (int i = 0; i < plaintext.length(); i++)
        {
            char ch = plaintext.charAt(i);
           int n = ch - 'A';

           char ch1 = mapping.charAt(n);

            res += ch1;
        }
        return res;
    }
}