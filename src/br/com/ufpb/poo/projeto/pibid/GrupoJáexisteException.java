package br.com.ufpb.poo.projeto.pibid;

public class GrupoJaExisteException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public GrupoJaExisteException (String msg){
		super(msg);
	}

}
