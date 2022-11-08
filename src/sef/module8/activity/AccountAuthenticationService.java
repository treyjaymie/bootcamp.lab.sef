package sef.module8.activity;

public class AccountAuthenticationService {

    public void authenticate(String name) throws AccountException {
        if (name.length() <= 4)
            throw new AccountException("Name must be longer than 4 characters", name);
    }
}
