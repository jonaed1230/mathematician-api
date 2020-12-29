package com.mathematician.mathematicianapi.services;

import com.mathematician.mathematicianapi.domain.User;
import com.mathematician.mathematicianapi.exceptions.EtAuthException;

public interface UserService {
  User validateUser(String email, String password) throws EtAuthException;

  User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;


}
