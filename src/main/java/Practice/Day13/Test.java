package Practice.Day13;

public class Test {

    public static void main(String[] args) {

        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Привет, как дела?");
        user1.sendMessage(user2, "У тебя все хорошо?");

        user2.sendMessage(user1, "Да, Все гуад");
        user2.sendMessage(user1, "А ты как?");

        user3.sendMessage(user1, "Привет, чего делаешь?");
        user3.sendMessage(user2, "Привет, чего делаешь? Я тут этому пишу user1 и решил и тебе написать");

        MessageDatabase.showDialog(user1, user2);
        System.out.println();
        MessageDatabase.showDialog(user2, user1);
        System.out.println();
        MessageDatabase.showDialog(user3, user1);
        System.out.println();
        MessageDatabase.showDialog(user3, user2);

    }

}
