package org.example;

//Пароль должен быть не менее 8 символов.
//Пароль должен содержать хотя бы одну цифру.
//Пароль должен содержать хотя бы одну заглавную букву.
//Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
public class PasswordVerifier {
    public static void isValid(String password)
            throws InvalidPasswordException
    {

        // для проверки, если длина пароля находится между 8 и 15
        if (password.length() < 8)  {
            throw new InvalidPasswordException(1);
        }

        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(2);
            }
        }

        if (true) {
            int count = 0;

            // проверка заглавных букв
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(3);
            }
        }
    }

    public static void main(String[] args)
    {

        String password = "qwertyui";

        try {
            System.out.println("Пароль " + password);
            isValid(password);
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

//        String password2 = "Geek007@GFG";
//        try {
//            System.out.println("\nIs Password "
//                    + password2 + " valid?");
//            isValid(password2);
//            System.out.println("Valid Password");
//        }
//        catch (InvalidPasswordException e) {
//            System.out.print(e.getMessage());
//            System.out.println(e.printMessage());
//        }
    }
}


