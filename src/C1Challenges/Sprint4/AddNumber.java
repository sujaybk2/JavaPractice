package C1Challenges.Sprint4;

public class AddNumber {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
    }
}