package com.kz.vd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author kz
 * @description
 * @date 2023/6/4 13:41
 */
@Slf4j
@RestController
public class TestController {

    @PostMapping("test")
    public Object test(@Valid @RequestBody Staff staff) {
        log.info(staff.toString());
        return staff;
    }

}
