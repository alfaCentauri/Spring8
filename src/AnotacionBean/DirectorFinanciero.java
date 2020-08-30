package AnotacionBean;

public class DirectorFinanciero implements Empleados {
	private CreacionInformeFinanciero informeFinanciero;

	/**
	 * Constructor con inyección de dependencias.
	 **/
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Gestión y dirección de las operaciones financieras de la empresa.";
	}

	@Override
	public String getInforme() {
		return this.informeFinanciero.getInformeFinanciero();
	}

}
