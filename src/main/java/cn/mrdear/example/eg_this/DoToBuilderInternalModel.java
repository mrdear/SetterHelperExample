package cn.mrdear.example.eg_this;

import lombok.Builder;

import cn.mrdear.example.model.UserDO;

import java.util.Date;
import java.util.List;

/**
 * @author quding
 * @since 2022/3/7
 */
@Builder
public class DoToBuilderInternalModel {

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

    /**
     * Standard
     */
    public DoToBuilderInternalModel(UserDO userDO) {
        // 在这里触发快捷键，则会补全下列代码
        this.email = userDO.getEmail();
        this.passwd = userDO.getPasswd();
        this.lastLoginTime = userDO.getLastLoginTime();
        this.notifyCount = userDO.getNotifyCount();
        this.address = userDO.getAddress();
    }

    /**
     * Standard
     */
    public static DoToBuilderInternalModel of(UserDO userDO) {
        DoToBuilderInternalModel doToBuilderInternalModel = DoToBuilderInternalModel.builder()
            .email(userDO.getEmail())
            .passwd(userDO.getPasswd())
            .lastLoginTime(userDO.getLastLoginTime())
            .notifyCount(userDO.getNotifyCount())
            .address(userDO.getAddress())
            .build();
        return doToBuilderInternalModel;
    }

    /**
     * test使用
     */
    public static DoToBuilderInternalModel of_test(UserDO userDO) {
        // 在这里面触发补全快捷键,即可以得到与上述相同结果

        return null; // 防止IDE报错
    }
}
