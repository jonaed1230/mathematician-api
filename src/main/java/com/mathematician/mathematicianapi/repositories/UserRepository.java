package com.mathematician.mathematicianapi.repositories;

import com.mathematician.mathematicianapi.domain.User;
import com.mathematician.mathematicianapi.exceptions.EtAuthException;

public interface UserRepository {
  Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

  User findByEmailAndPassword(String email, String password) throws EtAuthException;

  Integer getCountByEmail(String email);
  User findById(Integer userId);
}
