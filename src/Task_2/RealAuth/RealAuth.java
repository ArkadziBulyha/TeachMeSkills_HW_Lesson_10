package Task_2.RealAuth;

import Task_2.Exception.NotCorrectLoginException;
import Task_2.Exception.NotCorrectPasswordException;
import Task_2.Exception.WrongInputException;

public class RealAuth {
    public static boolean checkLogPass(String log, String pass, String conPass) throws NotCorrectLoginException, NotCorrectPasswordException, WrongInputException {
        //
        if (log.isEmpty() || pass.isEmpty() || conPass.isEmpty()) {
            throw new WrongInputException("Нужно заполнить все поля");
        }
        //
        if ((log.length() > 20) || (log.contains(" "))) {
            throw new NotCorrectLoginException("Логин не должен превышать 20 символов и не должен содержать пробелы ");
        }
        //
        if ((pass.length() <= 8 || pass.length() > 20)) {
            throw new NotCorrectPasswordException("Пароль должен быть не короче 8 символов и не больше 20 символов");
        }

        if ((!pass.contains(" "))) {
            if (!pass.matches("(.)*(\\d)(.)*")) {
                throw new NotCorrectPasswordException("Пароль должен содержать хотя бы одну цифру цифры ");
            }
        } else {
            throw new NotCorrectPasswordException("Пароль не должен содержать пробелы ");
        }

        if (!conPass.equals(pass)) {
            throw new NotCorrectPasswordException("Введенные пароли должны совпадать");
        }

        return true;
    }
}
