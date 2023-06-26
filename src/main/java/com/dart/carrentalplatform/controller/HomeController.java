package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.User;
import com.dart.carrentalplatform.util.Response;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 1:53 PM
 */
@Controller
@CrossOrigin
@RequestMapping("/vue-element-admin/user")
@Api
public class HomeController {

    @PostMapping("/login")
    @ResponseBody
    public Response login(@RequestBody User user) {
        return Response.success().setData("token", "vue_admin_template_token");
    }

    @GetMapping("/info")
    @ResponseBody
    public Response getInfo(@RequestParam String token) {
        return Response.success()
                .setData("roles", "[admin, editor]")
                .setData("name", "摘叶飞镖")
                .setData("avatar", "https://s3.bmp.ovh/imgs/2023/06/26/22777ab7bec47493.jpg")
                .setData("introduction", "个人介绍");
    }

    @PostMapping("/logout")
    @ResponseBody
    public Response logout() {
        return Response.success();
    }
}
