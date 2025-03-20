package com.carcontrol.persistencia.enums;

public enum TipoAssinatura {
    NORMAL(0, "Normal"),
    PREMIUM(1, "Premium"),
    EXLUSIVO(2, "Exclusivo");

    private final int codigo;
    private final String descricao;

    TipoAssinatura(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoAssinatura getTipoAssinatura(int codigo) {
        TipoAssinatura tipoAssinatura = null;
        for (TipoAssinatura t : TipoAssinatura.values()) {
            if (t.getCodigo() == codigo) {
                tipoAssinatura = t;
            }
        }
        return tipoAssinatura;
    }
}
