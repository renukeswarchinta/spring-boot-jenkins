package io.tpd.superheroes.repository;

import io.tpd.superheroes.domain.HeroEntity;
import io.tpd.superheroes.domain.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<HeroEntity,Long> {


}
