package enumDemo;

public class Main {
    static void main() {
        Days today = Days.THURSDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is weekend");
        }


        Status status = Status.SUCCESS;
        System.out.println(status.getCode());
        System.out.println(Status.ERROR.getCode());
//        System.out.println(Status.SUCCESS);
        for(Status status1 : Status.values()){
            System.out.println(status1);
        }

        System.out.println(Status.ERROR.ordinal());
        System.out.println(Status.SUCCESS.name());
    }
}
