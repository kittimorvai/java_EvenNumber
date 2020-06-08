package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        int finishNumber = 20;
        int countTotal = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            countTotal ++;
            System.out.println("Even number " + number);
            number++;
            if(countTotal >= 5){
                break;
            }
        }
    }

    public static boolean isEvenNumber(int num) {
        if ((num > 0) && (num % 2 == 0)) {
            return true;
        }
        return false;
    }
}
