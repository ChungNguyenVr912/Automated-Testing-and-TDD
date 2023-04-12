package fizz_buzz;

public class FizzBuzzTranslate {
    public static String FBTranslate(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if (number == 0){
            return "Zero";
        } else if (number < 0 || number >= 1000) {
            return "Out of ability";
        }
        if (isDivisibleBy3 && isDivisibleBy5){
            return "FizzBuzz";
        } else if (isDivisibleBy3) {
            return "Fizz";
        } else if (isDivisibleBy5) {
            return "Buzz";
        }else {
            if (number < 10){
                return oneDigit(number);
            } else if (number < 100) {
                return twoDigit(number);
            }else {
                return threeDigits(number);
            }
        }
    }

    public static String oneDigit(int number) {
        return switch (number) {
            case 0 -> "";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "invalid";
        };
    }

    public static String twoDigit(int number) {
        int tens = number / 10;
        int units = number % 10;
        String result;
        if (number <= 20) {
            switch (number) {
                case 10 -> result = "ten";
                case 11 -> result = "eleven";
                case 12 -> result = "twelve";
                case 13 -> result = "thirteen";
                case 15 -> result = "fifteen";
                case 18 -> result = "eighteen";
                case 20 -> result = "twenty";
                default -> result = oneDigit(units) + "teen";
            }
        } else {
            switch (tens) {
                case 2 -> result = "twenty " + oneDigit(units);
                case 3 -> result = "thirty " + oneDigit(units);
                case 4 -> result = "forty " + oneDigit(units);
                case 5 -> result = "fifty " + oneDigit(units);
                case 8 -> result = "eighty " + oneDigit(units);
                default -> result = oneDigit(tens) + "ty " + oneDigit(units);
            }
        }
        return result;
    }

    public static String threeDigits(int number) {
        int hundred = number / 100;
        int tens = number % 100;
        String result;
        if (tens == 0) {
            result = oneDigit(hundred) + " hundred";
        } else if (tens < 10) {
            result = oneDigit(hundred) + " hundred and " + oneDigit(tens);
        } else {
            result = oneDigit(hundred) + " hundred and " + twoDigit(tens);
        }
        return result;
    }
}
