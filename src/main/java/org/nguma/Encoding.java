package org.nguma;


    public class Encoding {
        public static String encode (String message, Integer cipherKey) {



            final String encodingAlphabets = Alphabets.getEncryptors();



//ENCODING PART

            String encodedText = "";

            for(int i=0; i<message.length(); i++){



                Character msgLetter = message.charAt(i);



                if(Character.isLetter(msgLetter)){



                    int cipherStart = encodingAlphabets.indexOf(msgLetter) + cipherKey;



                    if (cipherStart < encodingAlphabets.length() )

                        encodedText += encodingAlphabets.charAt(cipherStart);

                    else

                        encodedText += encodingAlphabets.charAt(cipherStart%encodingAlphabets.length());

                }

                else

                    encodedText += msgLetter;

            }

            return encodedText;

        }
    }

