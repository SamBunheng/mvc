package model.service;

import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    void addNewUser(UserDto userDto);
    void deleteByUserId(int id);
}
