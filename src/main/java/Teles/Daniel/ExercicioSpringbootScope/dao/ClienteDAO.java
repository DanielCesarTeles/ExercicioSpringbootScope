package Teles.Daniel.ExercicioSpringbootScope.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 14/06/2020 - 16:12
 */
@Component
@Getter
@Setter
public class ClienteDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
