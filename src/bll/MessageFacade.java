package bll;

import be.Message;
import model.MessageModel;

import java.util.List;

public class MessageFacade implements IMessageFacade{
    private MessageManager messageManager = MessageManager.getInstance();

    @Override
    public void sendMessage(String message) {
        messageManager.sendMessage(message);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageManager.getAllMessages();
    }

}
