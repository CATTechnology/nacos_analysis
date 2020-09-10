package top.takefly.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 10:30
 * 通用响应VO
 */
@Data
public class ResponseVO implements Serializable {

    /**
     * 是否请求成功
     */
    private Boolean succeed;

    /**
     * 状态码
     */
    private String code;

    /**
     * 响应描述
     */
    private String msg;

    public ResponseVO() {
    }

    public ResponseVO(Boolean succeed, String code, String msg) {
        this.succeed = succeed;
        this.code = code;
        this.msg = msg;
    }
}
