package test_0.old_;

public class sdfgh {

    public static void rnain(String args[])
         throws java.io.IOException{
        char choice, ignore;
        for (;;) {
            do {
                System.out.println("Cпpaвкa:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while");
                System.out.println(" 6. break");
                System.out.println(" 7. continue\n");
                System.out.print("Bыбepитe (q to quit): ");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');}
                while (choice < '1' || choice > '7' & choice != 'q') ;
                if (choice == 'q') break;
                System.out.println("\n");
                switch (choice) {
                    case '1':
                        System.out.println("Oпepaтop if:\n");
                        System.out.println("if(ycлoвиe) оператор;");
                        System.out.println("else оператор;");
                        break;
                    case '2':
                        System.out.println("Oпepaтop switch:\n");
                        System.out.println("swi tch (выражение) {");
                        System.out.println(" case константа:");
                        System.out.println(" последовательность операторов");
                        System.out.println(" break;");
                        System.out.println(" // ... ");
                        System.out.println("J");
                        break;
                    case 'З':
                        System.out.println("Oпepaтop for:\n");
                        System.out.print("for(init; условие; итерация}");
                        System.out.println(" оператор;");
                        break;
                    case '4':
                        System.out.println("Oпepaтop while:\n");
                        System.out.println("while(ycлoвиe) оператор;");
                        break;
                    case '5':
                        System.out.println("Oпepaтop do-while:\n");
                        System.out.println("do {");
                        System.out.println(" оператор;");
                        System.out.println("} while (условие);");
                        break;
                    case '6':
                        System.out.println("Oпepaтop break:\n");
                        System.out.println("break; или break метка;");
                        break;
                    case '7':
                        System.out.println("Oпepaтop continue:\n");
                        System.out.println("continue; или continue метка;");
                        break;}
                    System.out.println();

            }
    }
}
