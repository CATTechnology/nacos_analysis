package top.takefly.auth.frame.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.takefly.common.utils.ResponseBuilder;
import top.takefly.common.vo.ResponseVO;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 10:54
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理通用异常，避免返回异常信息
     *
     * @return
     */
    @ExceptionHandler(value = Throwable.class)
    public ResponseVO throwable(Throwable e) {
        log.warn("请求出现不可预知的错误，cause by [{}]", e.getMessage(), e);
        return ResponseBuilder.error();
    }
}
