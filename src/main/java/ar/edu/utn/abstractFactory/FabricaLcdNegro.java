package ar.edu.utn.abstractFactory;

public class FabricaLcdNegro extends FabricaTv {

	@Override
	public Tv createTv() {
		// TODO Auto-generated method stub
		return new Lcd();
	}

	@Override
	public Color createColor() {
		// TODO Auto-generated method stub
		return new Negro();
	}

}
