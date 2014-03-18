package br.com.ufpb.poo.projeto.pibid;

public class EscolaExistenteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EscolaExistenteException(String msg){
		super(msg);
	}
}
