package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    // 현재 방식
    @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
    public String Hello() {
        return "Hello";
    }

    // 예전 방식
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get http://localhost:9090/api/get/hi
    public String hi() {
        return "Hi";
    }

    // 변화하는 변수 name 받기
    @GetMapping("/path-variable/{name}") // http://localhost:9090/api/get/path-variable/{name}
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable: " + pathName);
        return pathName;
    }

    // Query Parameter : 구글에서 intellij 를 검색했을 때 URL 분석
    // search?q=intellij
    // &oq=intellij
    // &aqs=chrome..69i57j69i59j0i512l2j0i433i512j0i512l2j69i61.5057j0j1
    // &sourceid=chrome
    // &ie=UTF-8

    // http://localhost:9090/api/get/query-param?user=seoyun&email=sylph0105@naver.com&age=30

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    // 현업에서 제일 많이 사용하는 방법
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) {

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();

    }
}
