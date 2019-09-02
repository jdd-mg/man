package com.ppg.man;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequiredArgsConstructor(staticName = "of")
public class LombokTest {

    private String name;

    private Long id;

    public static void main(String[] args) {

        say(null);

    }


    public static void say(@NonNull String value) {
        System.out.println(value);
    }
}
