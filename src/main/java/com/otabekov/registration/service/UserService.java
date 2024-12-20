package com.otabekov.registration.service;

import com.otabekov.registration.dto.UserDto;
import com.otabekov.registration.entity.User;

public interface UserService {
    User findByUsername(String username);

    User save(UserDto userDto);

}
