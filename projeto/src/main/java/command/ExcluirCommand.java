package command;

import Dominio.EntidadeDominio;
import Dominio.Resultado;

public class ExcluirCommand extends AbstractCommand {

	@Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.Excluir(entidade);
	}

}
