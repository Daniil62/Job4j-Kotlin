package ru.job4j.dsl

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class BasicDataSourceBuilderTest : StringSpec({
    val pool = BasicDataSourceBuilder
        .driverClassName("org.postgres.Driver")
        .url("localhost")
        .userName("postgres")
        .password("*****")
        .minIdle(5)
        .maxIdle(10)
        .maxOpenPreparedStatements(100)
        .build()
    "Check fields" {
        pool.driverClassName shouldBe "org.postgres.Driver"
        pool.url shouldBe "localhost"
        pool.username shouldBe "postgres"
        pool.password shouldBe "*****"
        pool.minIdle shouldBe 5
        pool.maxIdle shouldBe 10
        pool.maxOpenPreparedStatements shouldBe 100
    }
})