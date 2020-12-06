package Strategy;

import Dominio.EntidadeDominio;
import Dominio.Sessao;
import dao.SessaoDAO;
import dao.IDAO;

public class ValidarDataSessao implements IStrategy {
    public String processar(EntidadeDominio entidade) {
        
        Sessao sessao = (Sessao) entidade;
        IDAO dao = new SessaoDAO();
    
        if(sessao.getDt_fim() <= sessao.getDt_incio()){
            return "A data de finalização da sessao deve ser menor do que a data de inicio!";
        }
        return null;
    }
} 