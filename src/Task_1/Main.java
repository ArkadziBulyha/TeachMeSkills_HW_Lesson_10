package Task_1;

import Task_1.Exceptions.IsExistsABCException;
import Task_1.Exceptions.IsExists555Exception;
import Task_1.Exceptions.IsExists1a2bException;


public class Main {

    public static void main(String[] args) {

        String numberDoc = "5557-UbN-9922-ToX-1q3c";
        StringBuilder strbNum = new StringBuilder("9379-UbU-9735-NtU-5G7r");

        System.out.println(NumbDoc.outNumb(numberDoc));
        System.out.println(NumbDoc.resizeLetter(numberDoc));
        System.out.println(NumbDoc.resizeFormat(numberDoc));
        System.out.println("Буквы: " + NumbDoc.resizeFormatStrB(strbNum));

        try {
            System.out.println(NumbDoc.isHaveABC(numberDoc));
        } catch (IsExistsABCException e1) {
            System.out.println("Исключение ABC: " + " " + e1.getMessage());
        }

        try {
            System.out.println(NumbDoc.isBegin(numberDoc));
        } catch (IsExists555Exception e2) {
            System.out.println("Исключение 555: " + " " + e2.getMessage());
        }

        try {
            System.out.println(NumbDoc.isEnd(numberDoc));
        } catch (IsExists1a2bException e3) {
            System.out.println("Исключение 1a2b: " + " " + e3.getMessage());
        }
    }
}
