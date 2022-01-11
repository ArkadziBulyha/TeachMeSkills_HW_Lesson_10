package Task_1;

import Task_1.Exceptions.IsExists1a2bException;
import Task_1.Exceptions.IsExists555Exception;
import Task_1.Exceptions.IsExistsABCException;

public class NumbDoc {
    static String outNumb(String line) {

        line = line.substring(0, 4) + " " + line.substring(9, 13);
        return line;

    }


    static String resizeLetter(String str) {

        str = str.replace("U", "u").
                replace("b", "B").
                replace("N", "n").
                replace("T", "t").
                replace("o", "O").
                replace("X", "x").
                replace("q", "Q").
                replace("c", "C");
        return str;

    }


    static String resizeFormat(String line) {

        line = (line.substring(5, 8) + "/" + line.substring(14, 17) + "/" +
                line.substring(19, 20) + "/" + line.substring(21)).toLowerCase();
        return line;
    }


    static String resizeFormatStrB(StringBuilder line) {
        return (line.substring(5, 8) + "/" + line.substring(14, 17) + "/" + line.substring(19, 20) + "/" + line.substring(21)).toUpperCase();
    }


    static String isHaveABC(String line) throws IsExistsABCException {

        line = line.toUpperCase();
        if (line.contains("ABC")) {
            return "Содержит ABC";
        } else {
            throw new IsExistsABCException(line + " " + "Не содержит последовательности ABC");
        }

    }


    static String isBegin(String line) throws IsExists555Exception {

        if (line.startsWith("555")) {
            return "Договор начинается с цифр 555";
        } else {
            throw new IsExists555Exception(line + " " + " Договор не начинается с цифр 555");
        }

    }


    static String isEnd(String line) throws IsExists1a2bException {

        if (line.endsWith("1a2b")) {
            return "Договор оканчивается на 1a2b";
        } else {
            throw new IsExists1a2bException(line + " " + "Договор не оканчивается на 1a2b");
        }
    }
}
