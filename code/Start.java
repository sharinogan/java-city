import java.util.Scanner;

class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] branches = new String[] { "New York", "London", "Paris", "Tokyo" };
        System.out.println("Enter City : ");
        String s = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < branches.length; i++) {
            if (branches[i].equals(s)) {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}