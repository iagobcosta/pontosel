package br.com.secrel.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * 
 * @author ana
 * Classe utilitária para auxiliar na utilização de recursos do JSF.
 *
 */
public final class FacesUtil {
	/**
	 * Message Bundle com as mensagens da aplicação.
	 */
	private static final String RESOURCE_BASE_NAME = "msg";
	
	/**
     * Construtor padrão para evitar a instanciação desta classe.
     */
    private FacesUtil() {
    }
    
    /**
     * Adiciona uma mensagem de atenção à pilha de mensagens a partir da chave informada.
     *
     * @param {@link
     *            String} com a chave da mensagem a ser exibida.
     */
    public static void adicionarMensagemAlerta(String chave, Object... argumentos) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(null, getMensagemAlerta(chave, argumentos));

    }

    public static void adicionarMensagemAlertaComponenteEspecifico(String idComponente, String key,
            Object... argumentos) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(idComponente, getMensagemAlerta(key, argumentos));
    }

    /**
     * Retorna uma mensagem de atenção a partir da chave informada.
     *
     * @param {@link
     *            String} com a chave da mensagem a ser exibida.
     * @return {@link FacesMessage}.
     */
    public static FacesMessage getMensagemAlerta(String chave, Object... argumentos) {
        String mensagem = getMensagem(chave, argumentos);
        return new FacesMessage(FacesMessage.SEVERITY_WARN, mensagem, null);
    }

    /**
     * Adiciona uma mensagem de sucesso à pilha de mensagens a partir da chave informada.
     *
     * @param {@link
     *            String} com a chave da mensagem a ser exibida.
     */
    public static void adicionarMensagemSucesso(String chave, Object... argumentos) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(null, getMensagemSucesso(chave, argumentos));

    }

    /**
     * Retorna uma mensagem de sucesso a partir da chave informada.
     *
     * @param {@link
     *            String} com a chave da mensagem a ser exibida.
     * @return {@link FacesMessage}.
     */
    public static FacesMessage getMensagemSucesso(String chave, Object... argumentos) {
        String mensagem = getMensagem(chave, argumentos);
        return new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, null);
    }

    /**
     * Adiciona uma mensagem de erro à pilha de mensagens a partir da chave informada.
     *
     * @param {@link
     *            String} com a chave da mensagem a ser exibida.
     */
    public static void adicionarMensagemErro(String chave, Object... argumentos) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(null, getMensagemErro(chave, argumentos));

    }

    public static void adicionarMensagemErroComponenteEspecifico(String idComponente, String key,
            Object... argumentos) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(idComponente, getMensagemErro(key, argumentos));
    }

    public static void adicionarMensagemSucessoComponenteEspecifico(String idComponente, String key,
            Object... argumentos) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(idComponente, getMensagemSucesso(key, argumentos));
    }

    /**
     * Retorna uma mensagem de erro a partir da chave informada.
     *
     * @param {@link
     *            String} com a chave da mensagem a ser exibida.
     * @return {@link FacesMessage}.
     */
    public static FacesMessage getMensagemErro(String chave, Object... argumentos) {
        String mensagem = getMensagem(chave, argumentos);
        return new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null);
    }

	
	/**
     * Retorna o Resource Bundle a partir do alias definido nesta classe.
     *
     * @return {@link ResourceBundle}.
     */
    public static ResourceBundle getBundle() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Application application = ctx.getApplication();
        return application.getResourceBundle(ctx, RESOURCE_BASE_NAME);
    }
    
    /**
     * Retorna a mensagem a partir da chave informada.
     *
     * @param {@link
     *            String} com a chave da mensagem.
     * @return {@link String} com mensagem.
     */
    public static String getMensagem(String chave, Object... argumentos) {
        String mensagem = null;

        // Obtem a mensagem a partir da chave.
        try {
            mensagem = getBundle().getString(chave);
        } catch (MissingResourceException e) {
            mensagem = chave;
        }

        // Substitui os argumentos, se informados.
        if (argumentos != null && argumentos.length > 0) {
            return MessageFormat.format(mensagem, argumentos);
        }

        return mensagem;
    }
}
