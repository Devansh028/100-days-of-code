package Code;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUser() {
        return "User from Service";
    }
}
