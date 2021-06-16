package ru.job4j.lambda.map

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import java.util.*

class CampaignConverterTest: StringSpec({
    val converter = CampaignConverter()
    val list = listOf(
        Campaign("First",
            Address("FirstCity", "FirstStreet", "1", "001"),
            Date(0)
        ),
        Campaign("Second",
            Address("SecondCity", "SecondStreet", "2", "002"),
            Date(0)
        ),
        Campaign("Third",
            Address("ThirdCity", "ThirdStreet", "3", "003"),
            Date(0)
        ))
    "Convert test" {
        converter.convert(list) shouldBe listOf(
            "Name: First\nAddress:\nFirstCity\nFirstStreet\n1\n001\nCreated: 01.01.1970\n",
            "Name: Second\nAddress:\nSecondCity\nSecondStreet\n2\n002\nCreated: 01.01.1970\n",
            "Name: Third\nAddress:\nThirdCity\nThirdStreet\n3\n003\nCreated: 01.01.1970\n")
    }
})