package top.takefly.auth.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.takefly.common.utils.ResponseBuilder;
import top.takefly.common.vo.ResponseMsgVO;
import top.takefly.common.vo.user.rep.UserReqVO;
import top.takefly.common.vo.user.req.UserRespVO;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 10:21
 * 鉴权
 */
@RestController
@RequestMapping("/auth/v1")
public class AuthController {

    @RequestMapping("/login")
    public ResponseMsgVO<UserRespVO> login(@RequestBody UserReqVO userReqVO) {
        UserRespVO userRespVO = UserRespVO.builder().id(1000L).phone("15886449241").username("戴灵飞").build();
        return ResponseBuilder.success(userRespVO);
    }

}
