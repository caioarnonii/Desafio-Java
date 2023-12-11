package utils;

import model.CPUModel;
import model.ComponenteModel;
import model.DiscoModel;
import model.MemoriaModel;

public enum ComponenteEnum {
    CPU(new CPUModel()),
    MEMORIA(new MemoriaModel()),
    DISCO(new DiscoModel()),
    ;

    private final ComponenteModel componente;

    ComponenteEnum(ComponenteModel obterDados) {
        this.componente = obterDados;
    }

    ComponenteModel getComponenteModel(){
        return componente;
    }
}
