package cn.dawnland.dawnland_back.utils;

import cn.dawnland.dawnland_back.utils.Result.ReturnData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BaseController {

    @ExceptionHandler(Exception.class)
    public ReturnData allExceptionHandler(Exception exception){
        return ReturnData.isFail(exception.getMessage());
    }
}
