package com.nomads.nomads.service;

import com.nomads.nomads.dto.UserDto;
import com.nomads.nomads.model.User;
import com.nomads.nomads.request.CreateUserRequest;
import com.nomads.nomads.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
