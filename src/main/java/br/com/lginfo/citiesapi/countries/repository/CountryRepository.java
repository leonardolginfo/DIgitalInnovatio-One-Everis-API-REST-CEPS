package br.com.lginfo.citiesapi.countries.repository;

import br.com.lginfo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
