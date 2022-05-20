package cn.mrdear.example.eg_multi_parameter;

import cn.mrdear.example.model.UserDTO;
import lombok.Data;

import java.util.List;

class Main {


    public UserDTO ToUserDTO(UserInternal user, Long id, List<String> address) {
        // TODO 在这里面触发补全快捷键,即可以得到与下面相同结果


        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPasswd();
        userDTO.setLastLoginTime();
        userDTO.setNotifyCount();
        userDTO.setAddress(address);
        return userDTO;
    }


    @Data
    class UserInternal {

        private String email;

        private String name;

        private Long lastLoginTime;
    }


}
