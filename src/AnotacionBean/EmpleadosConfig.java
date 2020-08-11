package AnotacionBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("AnotacionBean")
public class EmpleadosConfig {
	/**
	 * Define el bean para la clase InformeFinancieroDptoCompras.
	 **/
	@Bean
	public CreacionInformeFinanciero informeFinancieroDptoCompras() {
		return new InformeFinancieroDptoCompras();
	}
	
	/** 
	 * Define el bean para la clase DirectorFinanciero e inyecta la dependencia.
	 **/
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(this.informeFinancieroDptoCompras());
	}
}
