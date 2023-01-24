package br.com.ricas.personalthings.domain.service

import br.com.ricas.personalthings.domain.entity.Fund

interface CreateNewFundService {
        fun exec(fund: Fund): Fund

}