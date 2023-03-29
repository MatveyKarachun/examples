package io.github.matveykarachun;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class ThenReturnAndMapIgnoredTest {

    @Test
    void testThanReturn() {
        Mono.empty()
            .thenReturn(true)
            .as(StepVerifier::create)
            .expectNext(true)
            .verifyComplete();
    }

    @Test
    void testMapIgnored() {
        Mono.empty()
            .map(ignored -> true)
            .as(StepVerifier::create)
            .verifyComplete();
    }
}
