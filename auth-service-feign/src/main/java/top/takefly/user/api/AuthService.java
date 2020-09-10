package top.takefly.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.takefly.common.vo.ResponseMsgVO;
import top.takefly.common.vo.user.rep.UserReqVO;
import top.takefly.common.vo.user.req.UserRespVO;

/**
 * @author takefly
 * 用户鉴权
 */
@FeignClient(name = "auth-service")
public interface AuthService {

    /**
     * 用户登录
     * @param userReqVO
     * @return
     */
    @RequestMapping("/auth/v1/login")
    ResponseMsgVO<UserRespVO> login(@RequestBody UserReqVO userReqVO);
}
