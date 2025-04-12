package business.dao;

import business.model.Account;

public class AccountDAOImpl implements AccountDAO {
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean logout(String username) {
        return false;
    }

    @Override
    public boolean register(Account account) {
        return false;
    }

    @Override
    public boolean isLoggedIn(String username) {
        return false;
    }
}
