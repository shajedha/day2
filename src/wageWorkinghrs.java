public class wageWorkinghrs {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS=2;
        public static final int MAX_HRS_IN_MONTH=10;
        public static void main(String[] args) {
            int empHrs = 0;
            int totalempHrs = 0;
            int totalworkingDays = 0;
            while(totalempHrs<=MAX_HRS_IN_MONTH&&totalworkingDays<NUM_OF_WORKING_DAYS) {
                totalworkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                totalempHrs += empHrs;
                System.out.println("Day#" + totalworkingDays+"empHr:"+empHrs);
            }
            int totalempWage=totalempHrs*EMP_RATE_PER_HOUR;
            System.out.println("Total emp wage:" + totalempWage);
        }
    }


