/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.showcase.websockets;

import java.io.IOException;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import javaee.showcase.listeners.LoggerListener;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 *
 * @author Bartek
 */
public class SimpleHandler extends TextWebSocketHandler {
    private static final Logger LOG = Logger.getLogger(LoggerListener.class.getName());
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException{
            LOG.log(SEVERE,
                "========WEBSOCKET HANDSHAKE========="); 
            while(true){
                session.sendMessage(message);
            }
            
            // to work as client, read: 
            // https://developer.mozilla.org/pl/docs/WebSockets/Writing_WebSocket_client_applications
    }
}
