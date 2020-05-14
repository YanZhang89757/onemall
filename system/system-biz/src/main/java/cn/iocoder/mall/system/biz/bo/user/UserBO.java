package cn.iocoder.mall.system.biz.bo.user;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * User 模块 - User 信息 BO
 */
@Data
@Accessors(chain = true)
public class UserBO {

    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 头像
     */
    private String avatar;

    /**
     * 用户状态 1 - 开启；2 - 禁用
     */
    private Integer status;

}