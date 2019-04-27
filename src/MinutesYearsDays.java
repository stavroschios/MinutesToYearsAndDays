public class MinutesYearsDays {

    private static final String INVALID_VALUE = "Invalid Value";
    public static void printYearsAndDays(long minutes) {
        if( minutes < 0 ) {
            System.out.println(INVALID_VALUE);

        }
        long mintohours = 0;
        long reamianignhours = 0;
        for(int i =0 ; i < 60; i++ ) {
            mintohours = minutes / 60;
            reamianignhours = minutes % 60;
        }
            System.out.println( mintohours + " " + reamianignhours);

    }


}
