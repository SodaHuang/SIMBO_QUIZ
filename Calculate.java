public class Calculate {
    public String getSolution(Integer[] arr, Integer sum) {
        String solution = "No valid pair exists";

        if (null == arr || arr.length <= 2) {
            solution = "please enter more than two number";
        } else {
            Boolean isBreak = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    Integer total = arr[i] + arr[j];
                    if (total.equals(sum)) {
                        solution = "{" + arr[i] + "," + arr[j] + "}";
                        isBreak = true;
                        break;
                    }
                }
                if (isBreak) {
                    break;
                }
            }
        }
        return solution;
    }
}
