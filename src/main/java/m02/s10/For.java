package m02.s10;

public class For {
    public static void main(String[] args) {
        System.out.println("Please, pass a few args");
        for (int i = 0; i < args.length; i++) {
            System.out.print("The argument " + i);

            if (i == 2) {
                System.out.println(" is skipped");
                continue;
            }

            System.out.println(" is " + args[i]);
        }

        System.out.println("done!");
    }
}
