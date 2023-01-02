package com.in28minutes.rest.webservices.restfulwebservices.Assignments3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;



@Component
public class DetailService {
    private static List<ZipCodeDetails> det=new ArrayList<>();
    static {
        det.add(new ZipCodeDetails("Andhrapradesh","darsi","India", 523252));
        det.add(new ZipCodeDetails("UP","gajibadh","India",522002));
        det.add(new ZipCodeDetails("Texas","TexasTechUniversity","US",452345));
    }
    /*
     * public List<Details> findAll(){ return det; } public Details findAll(Details
     * det1) { det1.setZipcode(523252); return det1; }
     */
    public ZipCodeDetails findOne(int id) {
        Predicate<? super ZipCodeDetails> predicate = u -> u.getZipcode().equals(id);
         return det.stream().filter(predicate).findFirst().get();
    }
}
