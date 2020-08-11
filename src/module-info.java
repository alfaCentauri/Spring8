/**
 * Ejemplo del framework Spring con Java 11. Utilizando anotaciones con beans.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
module Spring8{
	exports AnotacionBean;
	requires spring.core;
	requires spring.context;
	requires spring.beans;
	requires java.base;
	requires java.annotation;
}