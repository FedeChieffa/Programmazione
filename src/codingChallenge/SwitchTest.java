package codingChallenge;

public class SwitchTest {
    public static void main(String[] args) {
        test('A');
        test('D');
        test('H');
        test('E');
    }
    public static void test(int f){
        switch (f){
            case 1:
                System.out.println(f+f);break;
            case 2:
                System.out.println(f*f);break;
            case 3:
                System.out.println(f/f);break;
            default:
                System.out.println(f%f);break;
        }

    }

    public static void test(char lettera){
        switch (lettera){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("THE CHARACTER " +lettera +" IS BEEN FOUND");break;
            default:
                System.out.println("CHARACTER NOT FOUND");break;
        }

    }
}
