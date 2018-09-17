package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String result = "";
        boolean isFizz = false;
        boolean isBuzz = false;
        boolean isDeluxe = false;

        if(isDivisibleByThree(number) || doesContainThree(number)){
            isFizz = true;
        }
        if (isDivisibleByFive(number) || doesContainFive(number) ){
            isBuzz = true;
        }
        if(isNumberDeluxe(number)){
             isDeluxe = true;
        }


        if(isFizz || isBuzz || isDeluxe){
            result =  number.toString();
        }else{
            if(isFizz && !isBuzz && !isDeluxe ){
                result = "fizz";
            }else if(!isFizz && isBuzz && !isDeluxe ){
                result = "buzz";
            }else if(!isFizz && !isBuzz && isDeluxe ){
                result = "deluxe";
            }else if(isFizz && !isBuzz && isDeluxe ){
                result = "fizz deluxe";
            }else if(!isFizz && isBuzz && isDeluxe ){
                result = "buzz deluxe";
            }else if(isFizz && isBuzz && isDeluxe ){
                result = "fizz buzz deluxe";
            }

        }


        return result;

    }

    private boolean isNumberDeluxe(Integer number){
        boolean isDeluxe = true;
        char[] numbers = number.toString().toCharArray();
        if(numbers.length >1){
            char firstNumber = numbers[0];
            for(Integer i =1; i < numbers.length; i++){
                if (numbers[i] != firstNumber){
                    isDeluxe = false;
                    break;
                }
            }
        }
        return isDeluxe;
    }

    private boolean isDivisible(Integer number, Integer toBeDividedWith){
        return number % toBeDividedWith == 0;
    }

    private boolean isDivisibleByFive(Integer number){
        return number % 5 == 0;
    }

    private boolean isDivisibleByThree(Integer number){
        return number % 3 == 0;
    }

    private boolean doesContain(Integer number, String toBeContained){
        return number.toString().contains(toBeContained);
    }

    private boolean doesContainFive(Integer number){
        return doesContain(number, "5");
    }

    private boolean doesContainThree(Integer number){
        return doesContain(number, "3");
    }



}
