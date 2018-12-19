package com.stackoverflow.pipilam;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/demo")
    public Demo demo() {
        return new Demo("pipilam",LocalDateTime.now());
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Demo {
    String name;
    LocalDateTime dateTime;
}