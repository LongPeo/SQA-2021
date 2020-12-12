package spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Override
    Page<Person> findAll(Pageable pageable);

    Person findByCardNumber(String cardNumber);
}