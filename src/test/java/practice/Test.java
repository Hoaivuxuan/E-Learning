package practice;

public class Test {
    int x;
    String name = "Hoai";

    public Test() {
        x = 281002;
    }

    public static void main(String[] args) {
        System.out.println("Hello Worlds!!");
        //
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        //
        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("Every"));
        //
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekend");
        }
        //
        Test myObj = new Test();
        System.out.print(myObj.name + " ");
        System.out.println(myObj.x);
        //

    }
}
