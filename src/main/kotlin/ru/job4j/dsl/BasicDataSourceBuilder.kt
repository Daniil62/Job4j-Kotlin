package ru.job4j.dsl

import org.apache.commons.dbcp2.BasicDataSource

class BasicDataSourceBuilder {
    companion object Builder {
        private val basicDataSource = BasicDataSource()
        fun driverClassName(driverName: String) =
            apply {basicDataSource.driverClassName = driverName
                return this}
        fun url(url: String) =
            apply {basicDataSource.url = url
                return this}
        fun userName(userName: String) =
            apply {basicDataSource.username = userName
                return this}
        fun password(password: String) =
            apply {basicDataSource.password = password
                return this}
        fun minIdle(minIdle: Int) =
            apply {basicDataSource.minIdle = minIdle
                return this}
        fun maxIdle(maxIdle: Int) =
            apply {basicDataSource.maxIdle = maxIdle
                return this}
        fun maxOpenPreparedStatements(mops: Int) =
            apply {basicDataSource.maxOpenPreparedStatements = mops
                return this}
        fun build(): BasicDataSource {
            return basicDataSource
        }
    }
}
fun main() {
    val pool = BasicDataSourceBuilder
        .driverClassName("org.postgres.Driver")
        .url("localhost")
        .userName("postgres")
        .password("*****")
        .minIdle(5)
        .maxIdle(10)
        .maxOpenPreparedStatements(100)
        .build()
    println(pool.driverClassName)
}