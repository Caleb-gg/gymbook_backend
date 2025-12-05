package com.github.calebgg.gymbook_backend.mapper;

import com.github.calebgg.gymbook_backend.Dto.UserDto;
import com.github.calebgg.gymbook_backend.Entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getEmail(),
                user.getUsername(),
                user.getPassword(),
                user.getCreated_at()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getEmail(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getCreated_at()
        );
    }
}
