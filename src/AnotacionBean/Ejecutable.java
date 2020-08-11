package AnotacionBean;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase con el main para ejecutar la demostración.
 **/
public class Ejecutable {

	public static void main(String[] args) {
		System.out.println("Demostración del uso de la anotación bean en Spring.");
		try {
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
			contexto.register(EmpleadosConfig.class);
			contexto.refresh();			
			Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
			System.out.println(empleado.getInforme());
			contexto.close();
		}catch(BeansException ex){
			System.out.println("Error: Con la creación del bean.");
		}
	}

}
