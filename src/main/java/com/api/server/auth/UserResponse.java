package com.api.server.auth;

import com.api.server.user.Role;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
  long id;
  String firstname;
  String lastname;
  String email;
  Role role;

  // wishlist

}
