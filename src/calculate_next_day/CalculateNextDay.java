package calculate_next_day;

import org.jetbrains.annotations.NotNull;

public class CalculateNextDay {
    public static @NotNull String getNextDay(@NotNull String date) {
        String[] inputArray = date.split("/");
        int[] dayArray = stringToIntArrayConvert(inputArray);
        int day = dayArray[0];
        int month = dayArray[1];
        int year = dayArray[2];
        boolean isDayValid = checkValidDay(day, month, year);
        boolean isLastDayOfYear = day == 31 && month == 12;
        boolean isLastDayOfMonth = checkLastDayOfMonth(day, month, year);
        if (isDayValid) {
            if (isLastDayOfYear) {
                return "1/1/" + (++year);
            } else if (isLastDayOfMonth) {
                return "1/" + (++month) + "/" + year;
            } else {
                return ++day + "/" + month + "/" + year;
            }
        } else {
            return "Invalid date!";
        }
    }


    private static boolean checkValidDay(int day, int month, int year) {
        boolean invalidMonth = month < 1 || month > 12;
        boolean invalidDays = day < 1 || day > 31;
        boolean isMonthHas30Days = check30Days(month);
        boolean isLeapYear = checkLeapYear(year);
        if (year < 0) {
            return false;
        } else if (invalidMonth) {
            return false;
        } else if (invalidDays) {
            return false;
        } else if (isMonthHas30Days) {
            if (day == 31) return false;
        } else if (month == 2) {
            if (!isLeapYear && day == 29) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy400) {
            return true;
        } else if (isDivisibleBy100) {
            return false;
        } else if (isDivisibleBy4) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean check30Days(int month) {
        return switch (month) {
            case 2, 4, 6, 9, 11 -> true;
            default -> false;
        };
    }

    private static boolean checkLastDayOfMonth(int day, int month, int year) {
        boolean endFebruary = (month == 2 && checkLeapYear(year) && day == 29)
                || (month == 2 && !checkLeapYear(year) && day == 28);
        if (check30Days(month) && day == 30) {
            return true;
        } else if (endFebruary) {
            return true;
        } else if (day == 31) {
            return true;
        }
        return false;
    }

    private static int @NotNull [] stringToIntArrayConvert(String @NotNull [] inputArray) {
        int[] result = new int[3];
        for (int i = 0; i < inputArray.length; i++) {
            result[i] = Integer.parseInt(inputArray[i]);
        }
        return result;
    }
}
