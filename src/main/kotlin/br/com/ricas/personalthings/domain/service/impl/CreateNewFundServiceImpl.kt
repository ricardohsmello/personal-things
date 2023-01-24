package br.com.ricas.personalthings.domain.service.impl

import br.com.ricas.personalthings.domain.entity.Fund
import br.com.ricas.personalthings.domain.service.CreateNewFundService
import org.springframework.stereotype.Service

@Service
class CreateNewFundServiceImpl : CreateNewFundService {
    fun validate(fund: Fund): Boolean {
        if (fund.name.length > 10)
           throw Exception("Fund name must have 10 char at max")

        return true
    }

    override fun exec(fund: Fund): Fund {
        validate(fund)

        return fund
    }
}