//package com.oa.server.websocket.controller;
//
//
//import com.oa.server.websocket.domain.RequestMessage;
//import com.oa.server.websocket.domain.ResponseMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
//import org.springframework.messaging.simp.user.SimpUserRegistry;
//import org.springframework.messaging.support.MessageHeaderAccessor;
//import org.springframework.stereotype.Controller;
//
//import java.security.Principal;
//
//
//@Controller
//public class WsControll {
//
//    @Autowired
//    private SimpMessagingTemplate messagingTemplate;
//
//    @Autowired
//    private WsControll wsControll;
//
//    public void toUser(String msg, String str) {
//        System.out.println(messagingTemplate);
//
//    }
//
//    @MessageMapping("/more")
//    @SendTo("/resp/getResponse")
//    public ResponseMessage say(RequestMessage message) {
//        System.out.println(message.getName());
//        return new ResponseMessage("welcome," + message.getName() + " !");
//    }
//
//    @MessageMapping("/one")
//    public void say2(RequestMessage message) {
//        messagingTemplate.convertAndSendToUser("1","/one", new ResponseMessage("响应点对点"));
////        wsControll.toUser(msg,str);
//    }
//
//
//}
