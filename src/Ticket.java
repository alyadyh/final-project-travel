//Generic Class
import java.util.*;
import java.lang.*;

class Ticket <K, V> {
    // public <T> void get_data(T apaaja);

    public <K, V> void get_data(K id, V choice){
        try{
            int min = 10000;
            int max = 99999;
            int random_num = (int)(Math.random()*(max-min+1)+min);
            int id_num = Integer.parseInt(id, 27);
            System.out.println(" Ticket: " + id_num + choice + random_num);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }

    public static int parseInt(String s, int radix)
                throws NumberFormatException
    {
        if (s == null) {
            throw new NumberFormatException("Cannot parse null string");
        }

        if (radix < Character.MIN_RADIX) {
            throw new NumberFormatException("radix " + radix +
                                            " less than Character.MIN_RADIX");
        }

        if (radix > Character.MAX_RADIX) {
            throw new NumberFormatException("radix " + radix +
                                            " greater than Character.MAX_RADIX");
        }

        boolean negative = false;
        int i = 0, len = s.length();
        int limit = -Integer.MAX_VALUE;

        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') { // Possible leading "+" or "-"
                if (firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if (firstChar != '+') {
                    throw NumberFormatException.forInputString(s, radix);
                }

                if (len == 1) { // Cannot have lone "+" or "-"
                    throw NumberFormatException.forInputString(s, radix);
                }
                i++;
            }
            int multmin = limit / radix;
            int result = 0;
            while (i < len) {
                // Accumulating negatively avoids surprises near MAX_VALUE
                int digit = Character.digit(s.charAt(i++), radix);
                if (digit < 0 || result < multmin) {
                    throw NumberFormatException.forInputString(s, radix);
                }
                result *= radix;
                if (result < limit + digit) {
                    throw NumberFormatException.forInputString(s, radix);
                }
                result -= digit;
            }
            return negative ? result : -result;
        } else {
            throw NumberFormatException.forInputString(s, radix);
        }
    }

    // public <K, V> void get_data(K id, V choice){                                                                                                                                                                                                                                                    
    //     int min = 10000;
    //     int max = 99999;
    //     int random_num = (int)(Math.random()*(max-min+1)+min);
    //     System.out.println(" Ticket: " + Integer.parseInt((String) id) + choice + random_num);
    // }
}