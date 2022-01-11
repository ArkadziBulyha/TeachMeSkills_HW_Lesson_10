package Task_2;

import Task_2.Exception.NotCorrectLoginException;
import Task_2.Exception.NotCorrectPasswordException;
import Task_2.Exception.WrongInputException;
import Task_2.RealAuth.RealAuth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean realAuth = false;
        String log;
        String pass;
        String conPass;

        while (!realAuth) {
            System.out.println("Введите логин, пожалуйста: ");
            log = sc.nextLine();

            System.out.println("Введите пароль, пожалуйста: ");
            pass = sc.nextLine();

            System.out.println("Подтвердите пароль, пожалуйста: ");
            conPass = sc.nextLine();

            try {
                if (RealAuth.checkLogPass(log, pass, conPass)) {
                    System.out.println("Спасибо, Регистрация успешно завершена!");
                    realAuth = true;
                }
            } catch (NotCorrectLoginException e1) {
                System.out.println("Неверный логин: " + e1.getMessage());
                System.out.println();
            } catch (NotCorrectPasswordException e2) {
                System.out.println("Неверный пароль: " + e2.getMessage());
                System.out.println();
            } catch (WrongInputException e3) {
                System.out.println(e3.getMessage());
            }
        }
    }
}
