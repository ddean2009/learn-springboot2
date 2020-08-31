package com.flydean.annotated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Stream;

/**
 * @author wayne
 * @version WelcomeController,  2020/8/30
 */
@RestController
public class WelcomeController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("www.flydean.com");
    }

    @GetMapping("/hellos")
    public Flux<String> getAll() {
        //使用lambda表达式
        return Flux.fromStream(Stream.of("www.flydean.com","flydean").map(String::toLowerCase));
    }

}
