package org.example;

public class Main {
    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatMediatorImpl();

        // create users and register them with the mediator
        User user1 = new BasicUser(chatMediator, "User 1");
        User user2 = new BasicUser(chatMediator, "User 2");
        User user3 = new BasicUser(chatMediator, "User 3");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        // users send and receive messages through the mediator
        user1.sendMessage("Hello, everyone!");
        System.out.println("---");

        user2.sendMessage("Hi there!");
        System.out.println("---");

        user3.sendMessage("Greetings!");
    }
}