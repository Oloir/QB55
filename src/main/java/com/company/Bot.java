package com.company;




import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.logging.Level;



public class Bot extends TelegramLongPollingBot{




    @Override
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        sendMsg(update.getMessage().getChatId().toString(), message);
    }


    public synchronized void sendMsg(String chatId, String s) {


        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log(Level.SEVERE, "Exception: ", e.toString());
        }
    }


    @Override
    public String getBotUsername() {
        return "QueBotBot";
    }

    @Override
    public String getBotToken() {
        return "943087428:AAEoLmSLXJfsTHbkA-wRIEmhoGKb-8SPrxI";
    }
}

