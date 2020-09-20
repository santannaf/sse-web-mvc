package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class EventController {
    private final List<SseEmitter> sseEmitters = new ArrayList<>();
    private int counter = 0;

    @RequestMapping("/connection")
    public SseEmitter enableQuickPromoNotifier() throws IOException {
        SseEmitter sseEmitter = new SseEmitter(100000L);
        sseEmitter.send("MessageCounter : " + counter);
        sseEmitters.add(sseEmitter);
        return sseEmitter;
    }

    @RequestMapping("/event")
    @ResponseStatus(value= HttpStatus.OK)
    public void enableQuickPromoForProduct() {
        counter++;
        List<SseEmitter> toRemove = new ArrayList<>();

        for (SseEmitter sseEmitter : sseEmitters) {
            try {
                sseEmitter.send("MessageCounter : " + counter);
            } catch (IOException ignore) {
                toRemove.add(sseEmitter);
            }
        }

        for (SseEmitter remove : toRemove) {
            sseEmitters.remove(remove);
        }
    }
}
