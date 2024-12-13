package spring.miage.dice.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.miage.dice.entity.DiceRollLog;

public interface DiceRepository extends JpaRepository<DiceRollLog, Long> {
}
