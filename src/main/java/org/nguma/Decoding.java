package org.nguma;

public class Decoding {
    public static String decode (String message, int cipherKey) {



//DECODING PART

        String encodingAlphabets = Alphabets.getEncryptors();;



        String decodingAlphabets = "";

        for(int j =0; j < encodingAlphabets.length(); j++) {

            int cipherStart = j + cipherKey;



            if (cipherStart < encodingAlphabets.length())

                decodingAlphabets += encodingAlphabets.charAt(cipherStart);

            else

                decodingAlphabets += encodingAlphabets.charAt(cipherStart % encodingAlphabets.length());

        }



        String decodedText = "";

        for(int k=0; k <message.length(); k ++){



            Character decodedLetter = message.charAt(k);



            if(Character.isLetter(decodedLetter)){



                int decipherStart = decodingAlphabets.indexOf(decodedLetter);



                if (decipherStart < decodingAlphabets.length() )

                    decodedText += encodingAlphabets.charAt(decipherStart);

                else

                    decodedText += encodingAlphabets.charAt(decipherStart%decodingAlphabets.length());

            }

            else

                decodedText += decodedLetter;

        }

        return decodedText;

    }
}

