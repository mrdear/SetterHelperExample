package cn.mrdear.example.eg_this;

import cn.mrdear.example.model.UserDO;

import java.util.Date;
import java.util.List;

/**
 * @author quding
 * @since 2022/3/7
 */
public class DoToInternalModel {

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

    public DoToInternalModel() {
    }


    public DoToInternalModel(UserDO userDO) {
        // TODO 在这里触发快捷键，则会补全下列代码
        this.email = userDO.getEmail();
        this.passwd = userDO.getPasswd();
        this.lastLoginTime = userDO.getLastLoginTime();
        this.notifyCount = userDO.getNotifyCount();
        this.address = userDO.getAddress();
    }

    /**
     * Standard
     */
    public static DoToInternalModel of(UserDO userDO) {
        // TODO 在这里触发快捷键，则会补全下列代码

        DoToInternalModel doToInternalModel = new DoToInternalModel();
        doToInternalModel.email = userDO.getEmail();
        doToInternalModel.passwd = userDO.getPasswd();
        doToInternalModel.lastLoginTime = userDO.getLastLoginTime();
        doToInternalModel.notifyCount = userDO.getNotifyCount();
        doToInternalModel.address = userDO.getAddress();
        return doToInternalModel;
    }

}
