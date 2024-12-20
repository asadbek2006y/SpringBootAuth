package com.otabekov.registration.repository;

import com.otabekov.registration.dto.UserDto;
import com.otabekov.registration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User save(UserDto userDto);
}