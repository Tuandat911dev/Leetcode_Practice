package array.easy;

public class _1295 {
    public int numberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (numberOfDigits(num) % 2 == 0) count++;
        }

        return count;
    }

    void main(String[] args) {
        System.out.println(findNumbers(new int[]{5554, 901, 482, 1771}));
    }
}
