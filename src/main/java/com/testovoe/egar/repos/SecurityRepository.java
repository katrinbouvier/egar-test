package com.testovoe.egar.repos;

import com.testovoe.egar.domain.Security;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@ComponentScan
@Repository
public interface SecurityRepository extends CrudRepository<Security, Long> {
}
