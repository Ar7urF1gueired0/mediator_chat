package UNIFESP.POO2.mediator_chat;

public interface IMediator {
    public void addUser(User user);
    public void sendMessage(String message, User user);
}