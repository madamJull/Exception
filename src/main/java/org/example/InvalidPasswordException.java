package org.example;

public class InvalidPasswordException extends Exception{
    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated)
    {
        super("Неверный пароль: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage()
    {
        // Вызов конструктора родительского исключения в соответствии с нарушенным условием
        switch (passwordConditionViolated) {

            case 1:
                return ("Пароль должен быть не менее 8 символов.");

            case 2:
                return ("Пароль должен содержать хотя бы одну цифру (0-9)");

            case 3:
                return ("Пароль должен содержать хотя бы одну заглавную букву (A-Z)");

        }

        return ("");
    }
}
