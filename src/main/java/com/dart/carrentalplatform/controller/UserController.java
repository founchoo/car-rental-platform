package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.User;
import com.dart.carrentalplatform.util.Response;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 1:53 PM
 */
@Controller
@CrossOrigin
@RequestMapping("/user")
@Api
public class UserController {

    @PostMapping("/login")
    @ResponseBody
    public Response login(@RequestBody User user) {
        return Response.success().setData("token", "vue_admin_template_token");
    }

    @GetMapping("/info")
    @ResponseBody
    public Response getInfo(@RequestParam String token) {
        if (Objects.equals(token, "vue_admin_template_token")) {
            return Response.success()
                    .setData("roles", "[admin]")
                    .setData("name", "Super Admin")
                    .setData("avatar", "https://s3.bmp.ovh/imgs/2023/06/26/22777ab7bec47493.jpg")
                    .setData("introduction", "个人介绍");
        } else {
            return Response.fail();
        }
    }

    @PostMapping("/logout")
    @ResponseBody
    public Response logout() {
        return Response.success();
    }
}
