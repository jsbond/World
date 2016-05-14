import java.util.Scanner;

/*
Использование цикла do-while для выбора пункта меню
 */
public class MenuTest {
    public static void main(String[] args)
            throws java.io.IOException {

        Scanner in = new Scanner(System.in);

        String choice;
        int num;

        do {
            System.out.println("Справка по:");
            System.out.println("     1. if");
            System.out.println("     2. switch");
            System.out.println("     3. while");
            System.out.println("     4. do-while");
            System.out.println("     5. for\n");
            System.out.println("Выберите интересующий пункт:");
            num = in.nextInt();

        } while (num<1 || num > 5);

        System.out.println("\n");

        switch(num) {
            case 1:
                System.out.println("if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case 2:
                System.out.println("switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case 3:
                System.out.println("while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case 4:
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            case 5:
                System.out.println("for:\n");
                System.out.print("for(инициализация; условие; повторение)");
                System.out.println(" оператор;");
                break;
        }
    }
}
