package cn.dawnland.dawnland_back.controller;

import cn.dawnland.dawnland_back.service.UUIDService;
import cn.dawnland.dawnland_back.utils.BaseController;
import cn.dawnland.dawnland_back.utils.Result.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("player")
public class UUIDController extends BaseController {

    @Autowired
    private UUIDService uuidService;

    @RequestMapping(value = "findUUIDByName", method = RequestMethod.POST)
    public ReturnData findUUIDByName(@RequestParam(value = "name")String name,
                                     HttpServletRequest request) throws Exception{
        return new ReturnData(uuidService.findUUIDByName(name));
    }

    @RequestMapping(value = "findNameByUUID", method = RequestMethod.POST)
    public ReturnData findNameByUUID(@RequestParam(value = "uuid")String uuid,
                                     HttpServletRequest request) throws Exception{
        return new ReturnData(uuidService.findNameByUUID(uuid));
    }


}
