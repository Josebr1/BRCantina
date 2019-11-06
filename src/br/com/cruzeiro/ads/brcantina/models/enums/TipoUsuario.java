package br.com.cruzeiro.ads.brcantina.models.enums;
/**
 * 
 * @author jose.antonio
 */
public enum TipoUsuario {
    ADMINISTRADOR,
    ATENDENTE;
    
    /**
     * 
     * @param tipoUsuario
     * @return 
     */
    public static int get(TipoUsuario tipoUsuario) {
        switch(tipoUsuario){
            case ADMINISTRADOR:
                return 1;
            case ATENDENTE:
                return 2;
            default:
                return 1;
        }
    }
}
