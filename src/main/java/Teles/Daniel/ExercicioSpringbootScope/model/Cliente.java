package Teles.Daniel.ExercicioSpringbootScope.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 14/06/2020 - 16:12
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cliente {

    public Cliente() {
        System.out.println("Classe cliente ");
    }
}
