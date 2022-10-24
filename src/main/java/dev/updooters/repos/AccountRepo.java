package dev.updooters.repos;

import dev.updooters.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
<<<<<<<<< Temporary merge branch 1

    Optional<Account> findByUsername(String username);
=========
     Account findByUsername(String username);


>>>>>>>>> Temporary merge branch 2
}
