package com.springboot.minimartapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/public")
public class PublicController {
    @GetMapping
    Map<String, Object> publicApi(){
        return Map.of(
                "message","welcome to my api"
        );}
}
