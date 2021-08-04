package b8_clean_code_refaction.thuc_hanh;

public class Refactoring {
        public static String fizzBuzz(int number){
            boolean isNumber3 = number % 3 == 0;
            boolean isNumber5 = number % 5 == 0;
            if(isNumber3 && isNumber5)
                return "FizzBuzz";

            if(isNumber3)
                return "Fizz";

            if(isNumber5)
                return "Buzz";

            return number + "";
        }
    }
