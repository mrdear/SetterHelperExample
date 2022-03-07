package cn.mrdear.example.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 代表输出结构,builder形式
 * @author quding
 * @since 2022/3/7
 */
@Builder
public class UserBuilderDTO {
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
