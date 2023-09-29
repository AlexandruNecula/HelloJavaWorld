import classes.MessageClass;

public class Main {
    public static void main(String[] args) {

        MessageClass message = new MessageClass();
        message.message= "Hello Java World";

        System.out.println(message.returnMessage());
    }
}