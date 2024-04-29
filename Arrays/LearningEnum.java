enum Months
{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUG, SEPT, OCT, NOV, DEC;
}
public class LearningEnum
{
    public static void main(String[] args)
    {
        Months[] selectmonth = Months.values();
         for (Months m:selectmonth)
         {
        
            switch (m)
            {
                case JANUARY:
                    System.out.println("It is January month");
                    break;
                case FEBRUARY:
                    System.out.println("It is February month");
                    break;
                
                case MARCH:
                    System.out.println("It is March month");
                    break;
                case APRIL:
                    System.out.println("It is April month");
                    break;
                case MAY:
                    System.out.println("It is May month");
                    break;
                case JUNE:
                    System.out.println("It is June month");
                    break;
                case JULY:
                    System.out.println("It is July month");
                    break;
                case AUG:
                    System.out.println("It is August month");
                    break;
                case SEPT:
                    System.out.println("It is September month");
                    break;
                case OCT:
                    System.out.println("It is October month");
                    break;
                case NOV:
                    System.out.println("It is November month");
                    break;
                case DEC:
                    System.out.println("It is December month");
                    break;

        }
        
    }
         }
     
        
}