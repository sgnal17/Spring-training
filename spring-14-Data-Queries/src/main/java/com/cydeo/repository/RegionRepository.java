package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RegionRepository extends JpaRepository<Region,Long> {


    //Display all regions in Canada
    List<Region> findByCountry(String country); //find,get,read = select By=Where
    List<Region> getByCountry(String country);

    //Display all regions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes 'United' in order(region)
    List<Region> findByCountryContainsOrderByRegionAsc(String country);

    //Display top 2 regions in United States
    List<Region> findTopByCountry(String country); //Only one
    List<Region> findTop2ByCountry(String country); //Top 2

    List<Region> findTopByCountryContainsOrderByRegionDesc(String country);

}
