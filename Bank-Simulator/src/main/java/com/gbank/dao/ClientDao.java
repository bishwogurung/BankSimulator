package com.gbank.dao;

import com.gbank.domain.Client;

public interface ClientDao {

    public Client getClientbyUsername(String userName);
    public Client login(String username, String password); //logout feature is implemented in the controller. easier that way
    public void register(String username, String firstName, String lastName, String email, String password);

}
