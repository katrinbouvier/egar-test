package com.testovoe.egar.service;

import com.testovoe.egar.model.Security;
import com.testovoe.egar.repos.SecurityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityService {

//    @Autowired
    private SecurityRepository securitiesRepo;

    public SecurityService(SecurityRepository securitiesRepo) {
        this.securitiesRepo = securitiesRepo;
    }

    public List<Security> findAll() {
        Iterable<Security> secs = securitiesRepo.findAll();
        ArrayList<Security> all = new ArrayList<>();
        secs.forEach(e -> all.add(e));
        return all;
    }

    public Long count() {
        return securitiesRepo.count();
    }

    public void deleteById(Long secId) {
        securitiesRepo.deleteById(secId);
    }

    public void updateEntry(int rowIndex, String columnId, String contentToUpdate) {
        List<Security> securities = findAll();
        Security entryToUpdate = new Security();

        for(int i=0; i<securities.size(); i++) {
            if (i == rowIndex) {
                entryToUpdate = securities.get(i);
            }
       }

        if((contentToUpdate!=null)&&(!contentToUpdate.equals(""))) {

            switch (columnId) {
                case "date":
                    entryToUpdate.setDate(contentToUpdate);
                    break;
                case "company":
                    entryToUpdate.setCompany(contentToUpdate);
                    break;
                case "cost":
                    entryToUpdate.setCost(Integer.parseInt(contentToUpdate));
                    break;
            }

            securitiesRepo.save(entryToUpdate);
        }
    }

    public List<String> getCompanies() {
        return securitiesRepo.getListCompanies();
    }

    public List<String> getDates() {
        return securitiesRepo.getListDates();
    }

    public List<Security> findByCompany(String company) {
        return securitiesRepo.findByCompanyOrderByDateAsc(company);
    }
}
