
public class threeDigitNumber {
    public static void main(String[] args) {

        for (int hundredunit = 1; hundredunit <= 9; hundredunit++) {

            for (int tensdigit = 0; tensdigit <= 9; tensdigit++) {

                for (int unitsdigit = 0; unitsdigit <= 9; unitsdigit++) {

                    int number = hundredunit * 100 + tensdigit * 10 + unitsdigit;

                    int sum = (hundredunit * hundredunit) + (tensdigit * tensdigit) + (unitsdigit * unitsdigit);

                    if (sum == number) {
                        System.out.println(number);
                        System.out.println("weldone great work");
                    }

                }
            }
        }
        
       System.out.println("please try again"); 
    }
}

