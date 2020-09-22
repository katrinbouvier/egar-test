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
    String GET_UNIQUE_DATES = "select distinct date from securities;";
    String GET_DATES = "select date from securities;";
    String GET_COMPANIES = "select distinct company from securities;";
    String GET_COSTS = "select cost from securities;";
    String GET_DATES_BY_COMPANY = "select date from securities s where s.company =";
    String GET_COSTS_BY_COMPANY = "select cost from securities where company= :company";

    // TODO: remove queries please

    @Query(value = GET_COMPANIES, nativeQuery = true)
    List<String> getListCompanies();

    @Query(value = GET_UNIQUE_DATES, nativeQuery = true)
    List<String> getListUniqueDates();

    @Query(value = GET_DATES, nativeQuery = true)
    List<String> getListDates();

    @Query(value=GET_DATES_BY_COMPANY, nativeQuery=true)
    List<Security> findDatesByCompany(@Param("company")String company);

    @Query(value=GET_COSTS_BY_COMPANY, nativeQuery=true)
    List<Security> findCostsByCompany(@Param("company")String company);

    @Query(value=GET_COSTS, nativeQuery=true)
    List<Integer> getListCosts();


    List<Security> findByCompanyOrderByDateAsc(String company);

}
