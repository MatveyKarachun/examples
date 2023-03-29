package io.github.matveykarachun;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class ReactorExceptionsTest {

    //Better to use handle or Mono.error() than throw

    @Test
    void testErrorInHandle() {
        Mono.just(1)
            .handle((it, sink) -> sink.error(new RuntimeException("RuntimeException in handle")))
            .as(StepVerifier::create)
            .verifyError();
    }

    @Test
    void testExceptionInMap() {
        Mono.just(1)
            .map(it -> {
                throw new RuntimeException("RuntimeException in map");
            })
            .as(StepVerifier::create)
            .verifyError();
    }
}
