package ar.edu.utn.factoryMethod;

import ar.edu.utn.exceptions.NotebookModelInvalidException;

public abstract class FactoryNotebook {
	public abstract Notebook create(String model)throws NotebookModelInvalidException ;
}
