package UNIFESP.POO2.mediator_chat;

public class Main {
    public static void main(String[] args) {
        
        IMediator chatRoom = new Mediator();

        User artur = new ChatUser(chatRoom, "Artur");
        User enrique = new ChatUser(chatRoom, "Enrique");
        User joao = new ChatUser(chatRoom, "João");
        User daniel = new ChatUser(chatRoom, "Daniel");

        chatRoom.addUser(artur);
        chatRoom.addUser(enrique);
        chatRoom.addUser(joao);
        chatRoom.addUser(daniel);

        artur.send("Enrique, você recebe esta mensagem?");
        System.out.println();
        enrique.send("Recebi sim!");
    }
}
