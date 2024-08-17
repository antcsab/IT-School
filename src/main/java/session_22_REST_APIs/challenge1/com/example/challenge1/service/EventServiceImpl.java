package session_22_REST_APIs.challenge1.com.example.challenge1.service;

import org.springframework.stereotype.Service;
import session_22_REST_APIs.challenge1.com.example.challenge1.model.SignUp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Service
public class EventServiceImpl implements EventService {
    @Override
    public void saveData(SignUp data) {
        try (FileOutputStream fileOut = new FileOutputStream("SignUp.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(data);
            System.out.println("Sign Up has been registered ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}