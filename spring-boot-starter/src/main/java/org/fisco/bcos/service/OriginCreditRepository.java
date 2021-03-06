package org.fisco.bcos.service;

import org.fisco.bcos.domain.OriginCredit;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface OriginCreditRepository extends CrudRepository<OriginCredit, BigInteger> {

}
