package Code;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String findUser() {
        return "User from Repository";
    }
}
