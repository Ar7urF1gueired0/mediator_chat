package UNIFESP.POO2.mediator_chat;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
    private List<User> users;

    public Mediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for (User u : this.users) {
            // A mensagem não deve ser recebida por quem a enviou
            if (u != sender) {
                u.receive(sender.name + ": " + msg);
            }
        }
    }
}