package cn.mrdear.example.eg_base;

import cn.mrdear.example.model.UserBuilderDTO;
import cn.mrdear.example.model.UserDO;
import cn.mrdear.example.model.UserDTO;

/**
 * 基本补全形式演示
 * @author quding
 * @since 2022/3/7
 */
public class DoToDto {

    /**
     * Standard
     */
    public static UserDTO toUserDto(UserDO userDO) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userDO.getId());
        userDTO.setName(userDO.getName());
        userDTO.setEmail(userDO.getEmail());
        userDTO.setPasswd(userDO.getPasswd());
        userDTO.setLastLoginTime(userDO.getLastLoginTime());
        userDTO.setNotifyCount(userDO.getNotifyCount());
        userDTO.setAddress(userDO.getAddress());
        return userDTO;
    }

    /**
     * Standard
     */
    public static UserBuilderDTO toUserBuilderDTO(UserDO userDO) {
        UserBuilderDTO userBuilderDTO = UserBuilderDTO.builder()
            .id(userDO.getId())
            .name(userDO.getName())
            .email(userDO.getEmail())
            .passwd(userDO.getPasswd())
            .lastLoginTime(userDO.getLastLoginTime())
            .notifyCount(userDO.getNotifyCount())
            .address(userDO.getAddress())
            .build();
        return userBuilderDTO;
    }

    /**
     * test使用
     */
    public static UserDTO toUserDto_test(UserDO userDO) {
        // 在这里面触发补全快捷键,即可以得到与上述相同结果

        return null; // 防IDE报错
    }

    /**
     * test使用
     */
    public static UserDTO toUserDto_test2(UserDO userDO) {
        // 光标在userDTO变量上触发,也能得到相同结果
        UserDTO userDTO = new UserDTO();

        return null; // 防IDE报错
    }

    /**
     * test使用
     */
    public static UserBuilderDTO toUserBuilderDTO_test(UserDO userDO) {
        // 在这里面触发补全快捷键,即可以得到与上述相同结果

        return null; // 防IDE报错
    }

}
