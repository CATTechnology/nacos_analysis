package top.takefly.common.vo.user.rep;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 10:24
 */
@Data
public class UserReqVO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * phone
     */
    private String phone;
}
