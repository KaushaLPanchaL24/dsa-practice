import java.util.Scanner;

public class print_star_pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter line you want to print pateern : ");
        int number_of_line = sc.nextInt();

        for(int line = 1; line <= number_of_line; line++){

            for (int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
