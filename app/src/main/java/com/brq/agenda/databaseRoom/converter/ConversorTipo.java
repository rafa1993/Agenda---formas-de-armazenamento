package com.brq.agenda.databaseRoom.converter;

import androidx.room.TypeConverter;

import com.brq.agenda.model.TipoTelefone;

public class ConversorTipo {

    @TypeConverter
    public String paraString (TipoTelefone tipo){
        return tipo.name();
    }

    @TypeConverter
    public TipoTelefone paraTipoTelefone(String valor){
        if (valor !=null){
            return TipoTelefone.valueOf(valor);
        }
        return TipoTelefone.FIXO;
    }

}
