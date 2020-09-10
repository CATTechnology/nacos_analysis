package top.takefly.common.utils;

import top.takefly.common.constants.ResponseConstants;
import top.takefly.common.vo.ResponseMsgVO;
import top.takefly.common.vo.ResponseVO;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 10:36
 * 响应实例构造
 */
public class ResponseBuilder {

    /**
     * 定义一些常量
     */

    /**
     * 构建带响应数据的成功实体
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseMsgVO<T> success(T data) {
        return new ResponseMsgVO<>(true, ResponseConstants.CODE_SUCCESS, ResponseConstants.MSG_SUCCESS, data);
    }

    /**
     * 构建成功实体
     */
    public static ResponseVO success() {
        return new ResponseVO(true, ResponseConstants.CODE_SUCCESS, ResponseConstants.MSG_SUCCESS);
    }

    /**
     * 构建失败实体
     */
    public static ResponseVO error() {
        return new ResponseVO(true, ResponseConstants.CODE_ERROR_UNKNOWN, ResponseConstants.MSG_ERROR_UNKNOWN);
    }

    /**
     * 构建失败实体
     */
    public static ResponseVO error(String msg) {
        return new ResponseVO(true, ResponseConstants.CODE_SUCCESS, msg);
    }

    /**
     * 构建带响应数据的失败实体
     */
    public static <T> ResponseMsgVO<T> error(T data) {
        return new ResponseMsgVO<>(true, ResponseConstants.CODE_SUCCESS, ResponseConstants.MSG_SUCCESS, data);
    }

    /**
     * 构建带响应数据的失败实体
     */
    public static <T> ResponseMsgVO<T> error(String msg, T data) {
        return new ResponseMsgVO<>(true, ResponseConstants.CODE_SUCCESS, msg, data);
    }


}
