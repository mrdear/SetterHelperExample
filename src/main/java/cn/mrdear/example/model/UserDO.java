package cn.mrdear.example.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 代表DB中的结构
 * @author quding
 * @since 2022/3/7
 */
@Data
public class UserDO {
    /**
     * DB主键
     */
    private Long id;
    /**
     * 用户名信息
     */
    private String name;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户密码
     */
    private String passwd;
    /**
     * 登录时间
     */
    private Date lastLoginTime;
    /**
     * 未读提醒数量
     */
    private Long notifyCount;
    /**
     * 联系地址
     */
    private List<String> address;

}
