package springboot.service;

import org.springframework.stereotype.Service;
import springboot.service.impl.Register;

@Service
public class UserService implements Register {
    @Override
    public String register() {
        return "register";
    }

}
