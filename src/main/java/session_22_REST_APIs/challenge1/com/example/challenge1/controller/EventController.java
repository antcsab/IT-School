package session_22_REST_APIs.challenge1.com.example.challenge1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import session_22_REST_APIs.challenge1.com.example.challenge1.model.SignUp;
import session_22_REST_APIs.challenge1.com.example.challenge1.service.EventService;

@RestController
public class EventController {

    private EventService service;

    @Autowired
    public EventController(EventService service) {
        this.service = service;
    }

    @PostMapping("api/signUP")
    public void SignUp(@RequestBody SignUp data) {

        service.saveData(data);

    }

}
