package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String result = "";

         if(isDivisibleByThree(number) || doesContainThree(number)){
            result += "fizz";
        }
        if (isDivisibleByFive(number) || doesContainFive(number) ){
            result += "buzz";
        }

        if(result.equalsIgnoreCase("")){
             result =  number.toString();
        }

        if(result.equalsIgnoreCase("fizzbuzz")){
             result = "fizz buzz";
        }

        return result;

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
