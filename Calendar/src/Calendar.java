
public class Calendar {
    public static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        }
        return false;
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if (isLeapYear(year)){
            return LEAP_MAX_DAYS[month - 1];
        }
        return MAX_DAYS[month - 1];
    }

    public void printCalendar(int year, int month, int count) {
        Calendar cal = new Calendar();
        System.out.printf("    <%d년 %d월>%n",year, month);
        System.out.println("SU MO TU WE TH FR SA");
        System.out.println("----------------------");
        int MAX_DAYS = cal.getMaxDaysOfMonth(year, month);
        for (int i = 0; i < count; i++){
            System.out.print("   ");
        }
        for (int i = 0; i < MAX_DAYS; i++){
            if (i < 9){
                System.out.printf(" %d ",i+1);
            }else{
                System.out.printf("%d ", i+1);
            }
            count++;
            if ((count)%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }

}