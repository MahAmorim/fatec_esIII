package command;

import Dominio.EntidadeDominio;
import Dominio.Resultado;

public class AlterarCommand extends AbstractCommand {

	@Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.Alterar(entidade);
	}

}
