public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        if (start <= end) {
            String[] arrFizBuz = new String[(end - start) + 1];
            int number = start;
            for (int i = 0; i < arrFizBuz.length && number <= end; i++) {
                if (number % 3 == 0 && number % 5 == 0) {
                    arrFizBuz[i] = "FizzBuzz";
                } else if (number % 3 == 0) {
                    arrFizBuz[i] = "Fizz";
                } else if (number % 5 == 0) {
                    arrFizBuz[i] = "Buzz";
                } else {
                    arrFizBuz[i] = String.valueOf(number);
                }
                number++;
            }
            return arrFizBuz;
        } else {
            return new String[0];
        }
    }
}
