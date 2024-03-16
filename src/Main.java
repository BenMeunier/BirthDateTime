import java.util.Scanner;

 class BirthDateTimeInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "Enter the year of birth ", 1950, 2015); // get birth year
        int month = SafeInput.getRangedInt(scanner, "Enter the month of birth ", 1, 12); // get birth month


        int daysInMonth = getDaysInMonth(month, year);
        int day = SafeInput.getRangedInt(scanner, "Enter the day of birth", 1, daysInMonth); //get birthday

        int hours = SafeInput.getRangedInt(scanner, "Enter the birth hour ", 1, 24); // get hour of birth
        int minutes = SafeInput.getRangedInt(scanner, "Enter the birth minute ", 1, 59); // get minute of birth

        System.out.println("You were born on " + year + "-" + month + "-" + day + " at " + hours + ":" + minutes); // give exact birth moment

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2: // February
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            default:
                return 31;
        }
    }
}