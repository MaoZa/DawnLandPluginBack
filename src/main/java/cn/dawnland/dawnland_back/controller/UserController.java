package cn.dawnland.dawnland_back.controller;

import cn.dawnland.dawnland_back.service.UserService;
import cn.dawnland.dawnland_back.utils.Result.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findScore", method = RequestMethod.POST)
    public ReturnData findScore(@RequestParam("name")String name){
        return new ReturnData(userService.fingScore(name));
    }

    @RequestMapping(value = "updateScore", method = RequestMethod.POST)
    public ReturnData updateScore(@RequestParam("name")String name,
                                @RequestParam("symal")String symal,
                                @RequestParam("amount")Long amount){
        return new ReturnData(userService.updateScore(name, symal, amount));
    }


}
