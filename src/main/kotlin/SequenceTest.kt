package org.example

import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit

class Product(
    private var price: Long,
    private var isOnSale: Boolean,
    private var discount: Long
) {
    fun isOnSale() = isOnSale

    fun applyDiscount(): Product {
        return Product(price - (price * (discount / 100)), true, 0)
    }
}

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
class SequenceTest {

    private var products = listOf<Product>(
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23), Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23), Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
        Product(350, false, 12),
        Product(450, true, 15),
        Product(550, true, 19),
        Product(650, false, 20),
        Product(750, true, 3),
        Product(950, false, 10),
        Product(1050, true, 45),
        Product(1250, false, 38),
        Product(650, true, 96),
        Product(12350, false, 33),
        Product(11231250, true, 23),
        Product(11231250, true, 23),
        Product(150, true, 5),
        Product(250, true, 10),
    )

    private fun countWithMap(): List<Product> {
        return products.filter { it.isOnSale() }.map { it.applyDiscount() }
    }

    private fun countWithSequence(): List<Product> {
        return products.asSequence()
            .filter { it.isOnSale() }
            .map { it.applyDiscount() }
            .toList()
    }

    @Benchmark
    fun countWithMapBenchMark(): List<Product> {
        return countWithMap()
    }


    @Benchmark
    fun countWithSequenceBenchMark(): List<Product> {
        return countWithSequence()
    }
}
