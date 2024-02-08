package org.example

import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
class InlineTest {

    private inline fun inlineFun(body: () -> Int): Int {
        return body() + Random.nextInt(1000 )
    }

    private fun nonInlineFun(body: () -> Int): Int {
        return body() + Random.nextInt(1000 )
    }

    @Benchmark
    fun inlineBenchmark(): Int {
        return inlineFun { Random.nextInt(1000 ) }
    }

    @Benchmark
    fun nonInlineBenchmark(): Int {
        return nonInlineFun { Random.nextInt(1000 ) }
    }
}
