package top.takefly.common.vo;

import lombok.Data;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 10:34
 * 响应内容
 */
@Data
public class ResponseMsgVO<T> extends ResponseVO {

    /**
     * 响应数据
     */
    private T data;

    public ResponseMsgVO() {
    }

    public ResponseMsgVO(T data) {
        this.data = data;
    }

    public ResponseMsgVO(Boolean succeed, String code, String msg, T data) {
        super(succeed, code, msg);
        this.data = data;
    }

}
