package Teles.Daniel.ExercicioSpringbootScope;

import Teles.Daniel.ExercicioSpringbootScope.dao.ClassJDBC;
import Teles.Daniel.ExercicioSpringbootScope.dao.ClienteDAO;
import Teles.Daniel.ExercicioSpringbootScope.model.Cliente;
import Teles.Daniel.ExercicioSpringbootScope.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExercicioSpringbootScopeApplication {

	public static void main(String[] args) {

		ApplicationContext apliccatioContext = SpringApplication.run(ExercicioSpringbootScopeApplication.class, args);

		ClassJDBC objJDBC = apliccatioContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = apliccatioContext.getBean(ClassJDBC.class);


		ClienteDAO objDAO = apliccatioContext.getBean(ClienteDAO.class);
		ClienteDAO objDAO1 = apliccatioContext.getBean(ClienteDAO.class);

		System.out.println("Exemplo de obj com mesmo endereço de memória");
		System.out.println("Obejeto da classe JDBC" + objJDBC);
		System.out.println("Obejeto da classe JDBC 1" + objJDBC1);

		System.out.println("\nObejeto da classe DAO" + objDAO);
		System.out.println("Obejeto da classe DAO 1" + objDAO1);

		Pessoa pessoa = apliccatioContext.getBean(Pessoa.class);
		Pessoa pessoa1 = apliccatioContext.getBean(Pessoa.class);

		Cliente cliente = apliccatioContext.getBean(Cliente.class);
		Cliente cliente1 = apliccatioContext.getBean(Cliente.class);

		System.out.println("Exemplo com SCOPE_PROTOTYPE");
		System.out.println("Objeto da classe pessoa" + pessoa);
		System.out.println("Objeto da classe pessoa" + pessoa1);


		System.out.println("\nObjeto da classe Cliente" + cliente);
		System.out.println("Objeto da classe Cliente" + cliente1);


	}

}
