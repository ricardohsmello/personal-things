package br.com.ricas.personalthings.domain.service

import br.com.ricas.personalthings.domain.entity.FundFakeData
import br.com.ricas.personalthings.domain.service.impl.CreateNewFundServiceImpl
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CreateNewFundServiceTest {

    @MockK
    lateinit var service: CreateNewFundService

    @BeforeAll
    fun before() {
        service = CreateNewFundServiceImpl()
    }
    @Test
    fun `should create a new fund successfully` () {
        val fund = FundFakeData.xplog11()
        assertEquals(service.exec(fund), fund)
    }

    @Test
    fun `should throws Exception when fund has a invalid name` () {
        val fund = FundFakeData.fundExceededName()
        assertThrows<Exception> {
            service.exec(fund)
        }
     }
}