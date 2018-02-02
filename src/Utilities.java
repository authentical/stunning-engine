public class Utilities {

    // Returns char carray with every nth char
    // sourcearray.lenth < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {
//
//        if(n ==0){
//            throws new ArithmeticException();
//        }

        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;    // Divide by 0
        char[] result = new char[returnedLength];       // Is null if
        int index = 0;

        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }

        return result;
    }


    // Removes pairs of the same character that are next to each,
    // by removing one occurence of the character

    public String removePairs(String source) {

        if (source == null || source.length() < 2) {
            return source;
        }


        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length-1; i++) {
            if (string[i] != string[i+1]) {
                sb.append(string[i]);
            }
        }
        System.out.println(string[string.length -1]);
        sb.append(string[string.length-1]);

        return sb.toString();
    }


    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;          //Divides 0
    }


    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }

        return null;
    }
}

































