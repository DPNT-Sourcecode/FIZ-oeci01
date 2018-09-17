package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if(isDivisibleByThree(number) &&  isDivisibleByFive(number)){
            return "fizz buzz";
        }else if(isDivisibleByThree(number)){
            return "fizz";
        }else if (isDivisibleByFive(number)){
            return "buzz";
        }else {
            return number.toString();
        }
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



}
