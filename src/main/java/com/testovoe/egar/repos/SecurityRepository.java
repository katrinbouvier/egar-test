package com.testovoe.egar.repos;

import com.testovoe.egar.model.Security;
import com.testovoe.egar.service.SecurityService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface SecurityRepository extends CrudRepository<Security, Long> {

    String GET_DATES = "select date from securities;";
    String GET_COMPANIES = "select distinct company from securities;";

    @Query(value = GET_COMPANIES, nativeQuery = true)
    List<String> getListCompanies();

    @Query(value = GET_DATES, nativeQuery = true)
    List<String> getListDates();

    List<Security> findByCompanyOrderByDateAsc(String company);

}
