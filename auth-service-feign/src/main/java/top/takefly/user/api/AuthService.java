package top.takefly.user.api;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.takefly.common.vo.ResponseMsgVO;
import top.takefly.common.vo.user.rep.UserReqVO;
import top.takefly.common.vo.user.req.UserRespVO;
import top.takefly.user.config.AuthServiceConfiguration;

/**
 * @author takefly
 * 用户鉴权
 */
@FeignClient(name = "auth-service",configuration = AuthServiceConfiguration.class)
@EnableConfigurationProperties(AuthServiceConfiguration.class)
public interface AuthService {

    /**
     * 用户登录
     * @param userReqVO
     * @return
     */
    @RequestMapping("/auth/v1/login")
    ResponseMsgVO<UserRespVO> login(@RequestBody UserReqVO userReqVO);
}
