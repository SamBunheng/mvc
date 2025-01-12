package model.service;

import mapper.Mapper;

import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;
import model.User;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{
    private final UserDao userDao = new UserDaoImpl();

    @Override
    public List<UserDto> getAllUsers() {
        return userDao.getAllUser()
                .stream()
                .map(Mapper::fromUserToUserDto)
                .toList();
    }

    @Override
    public void addNewUser(UserDto userDto) {
        int nextId = 3;
        User user = new User(++nextId, userDto.name(), userDto.email());
        userDao.addNewUser(user);
    }

    @Override
    public void deleteByUserId(int id) {
        userDao.deleteUserById(id);
    }

}
