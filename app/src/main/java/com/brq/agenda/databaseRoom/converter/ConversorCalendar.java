package com.brq.agenda.databaseRoom.converter;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import java.util.Calendar;

public class ConversorCalendar {

    @TypeConverter
    public Long paraLong(Calendar valor){
            return valor.getTimeInMillis();
    }

    @TypeConverter
    public Calendar paraCalendar(Long valor){
        Calendar momentoAtual = Calendar.getInstance();
        if (valor !=null){
            momentoAtual.getTimeInMillis();
        }
        return momentoAtual;
    }

}
