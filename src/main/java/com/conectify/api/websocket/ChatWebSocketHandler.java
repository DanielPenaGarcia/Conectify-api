package com.conectify.api.websocket;

import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ChatWebSocketHandler extends TextWebSocketHandler {

    private Map<String, WebSocketSession> sessions = new HashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        String username = session.getUri().getQuery().split("=")[1];
        sessions.put(username, session);
        System.out.println("Nueva conexión WebSocket de: " + username);
        session.sendMessage(new TextMessage("Bienvenido al chat, " + username + "!"));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String username = getUsernameFromSession(session);
        if (username != null) {
            String[] parts = message.getPayload().split(":", 2);
            if (parts.length == 2) {
                String recipient = parts[0];
                String msgContent = parts[1];
                WebSocketSession recipientSession = sessions.get(recipient);
                if (recipientSession != null) {
                    recipientSession.sendMessage(new TextMessage(username + " te dijo: " + msgContent));
                    session.sendMessage(new TextMessage("Mensaje enviado a " + recipient));
                } else {
                    session.sendMessage(new TextMessage("El usuario " + recipient + " no está conectado."));
                }
            } else {
                session.sendMessage(new TextMessage("Formato de mensaje incorrecto. Usa: destinatario: mensaje"));
            }
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        String username = getUsernameFromSession(session);
        if (username != null) {
            sessions.remove(username);
        }
        System.out.println("Conexión cerrada: " + username);
    }

    private String getUsernameFromSession(WebSocketSession session) {
        String username = null;
        for (String key : sessions.keySet()) {
            if (sessions.get(key).equals(session)) {
                username = key;
                break;
            }
        }
        return username;
    }
}
