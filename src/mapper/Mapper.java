package mapper;

import model.User;
import model.dto.UserDto;

public class Mapper {
    public static UserDto fromUserToUserDto(User user){
        if(user==null){
            return null;
        }
        return new UserDto(user.getName(), user.getEmail());
    }
    public static User fromUserDtoToUser(UserDto userDto){
        if (userDto == null){
            return null;
        }
        return new User(1, userDto.name(), userDto.email());
    }
}
