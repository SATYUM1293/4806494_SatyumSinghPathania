import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int n = s.length();
        char timezone = s.charAt(n-2);
        String time = s.substring(0,8);
        String[] str = time.split(":");
        int hour = Integer.parseInt(str[0]);
        String min = str[1];
        String sec = str[2]; 
        if(timezone=='P' && hour!=12 ) hour=hour+12;
        else if(timezone=='A' && hour==12) hour=0;
        String Ahour = String.format("%02d", hour);
        return Ahour+":"+min+":"+sec;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

