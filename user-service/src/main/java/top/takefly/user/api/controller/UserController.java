package top.takefly.user.api.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.takefly.user.api.AuthService;
import top.takefly.common.vo.ResponseMsgVO;
import top.takefly.common.vo.user.rep.UserReqVO;
import top.takefly.common.vo.user.req.UserRespVO;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 11:15
 * 用户模块
 */
@RestController
@RequestMapping("/user/v1/info")
public class UserController {

    @Autowired
    private AuthService authService;

    @GetMapping("/{id}")
    public ResponseMsgVO<UserRespVO> info(@PathVariable("id") Long id) {
        UserRespVO userRespVO = UserRespVO.builder().id(1000L).build();
        UserReqVO userReqVO = new UserReqVO();
        BeanUtils.copyProperties(userRespVO , userReqVO);
        return authService.login(userReqVO);
    }

}
