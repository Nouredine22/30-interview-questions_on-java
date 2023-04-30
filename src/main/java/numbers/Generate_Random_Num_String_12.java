package numbers;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Generate_Random_Num_String_12 {
    public static void main(String[] args) {

        // Random  Object
        Random random = new Random();

        int randomNumber = random.nextInt(2000); //from 0-1999
        System.out.println(randomNumber);

        double randomDouble = random.nextDouble(); //range 0.0 less than 1.0
        System.out.println(randomDouble);

        //math.random()
        System.out.println(Math.random());

        //Apache commons-lang API
        String randStrNum = RandomStringUtils.randomNumeric(4); //count of digits
        System.out.println("string num: "+randStrNum);

        String randStr = RandomStringUtils.randomAlphabetic(10);//count of chars
        System.out.println(randStr);

        String mix = RandomStringUtils.randomAlphanumeric(2,5);//min and max length of char & digit
        System.out.println(mix);

    }
}
