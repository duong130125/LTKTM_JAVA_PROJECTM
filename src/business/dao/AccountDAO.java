package business.dao;

import business.model.Account;

public interface AccountDAO {
    boolean login(String username, String password);
    boolean logout(String username);
    boolean register(Account account);
    boolean isLoggedIn(String username);
}
