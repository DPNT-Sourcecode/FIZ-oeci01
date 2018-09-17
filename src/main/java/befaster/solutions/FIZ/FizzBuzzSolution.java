package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String result = "";
        boolean isFizz = false;
        boolean isBuzz = false;
        boolean isFizzDeluxe = false;
        boolean isBuzzDeluxe = false;
        boolean isFakeDeluxe = false;

        if(isDivisibleByThree(number)){
            isFizz = true;
            if(doesContainThree(number)){
                isFizzDeluxe = true;
            }
        }
        if (isDivisibleByFive(number)){
            isBuzz = true;
            if(doesContainFive(number)){
                isBuzzDeluxe = true;
            }
        }
        if(isFizzDeluxe || isBuzzDeluxe){
                if(isNumberFakeDeluxe(number)){
                    isFakeDeluxe = true;
                }
        }


        if(isFizz || isBuzz){
            if(isFizz && !isBuzz && !isFizzDeluxe ){
                result = "fizz";
            }else if(!isFizz && isBuzz && !isBuzzDeluxe ){
                result = "buzz";
            }else if(isFizz && !isBuzz && isFizzDeluxe ){
                result = "fizz deluxe";
            }else if(!isFizz && isBuzz && isBuzzDeluxe ){
                result = "buzz deluxe";
            }else if(isFizz && isBuzz && (isFizzDeluxe || isBuzzDeluxe) ){
                result = "fizz buzz deluxe";
            }else if(isFizz && isBuzz && (!isFizzDeluxe && !isBuzzDeluxe) ){
                result = "fizz buzz";
            }
        }else{
            result =  number.toString();
        }

        if(result.contains("deluxe") && isFakeDeluxe){
            result = result.replaceAll("deluxe" , "fake deluxe");
        }

        return result;

    }

    private boolean isNumberFakeDeluxe(Integer number){
        return !isDivisible(number, 2);
    }

/*    private boolean isNumberDeluxe(Integer number){
        boolean isDeluxe = true;
        String[] numbers = number.toString().split("");
        if(numbers.length >1){
            String firstNumber = numbers[0];
            for(Integer i =1; i < numbers.length; i++){
                if (!numbers[i].equalsIgnoreCase(firstNumber)){
                    isDeluxe = false;
                    break;
                }
            }
        }else{
            isDeluxe = false;
        }
        return isDeluxe;
    }*/

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
