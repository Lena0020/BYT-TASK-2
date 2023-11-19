package org.example;

interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
