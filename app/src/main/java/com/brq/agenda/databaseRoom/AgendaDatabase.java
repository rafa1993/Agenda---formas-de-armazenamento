package com.brq.agenda.databaseRoom;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.brq.agenda.databaseRoom.converter.ConversorCalendar;
import com.brq.agenda.databaseRoom.converter.ConversorTipo;
import com.brq.agenda.databaseRoom.dao.AlunoDAO;
import com.brq.agenda.databaseRoom.dao.TelefoneDAO;
import com.brq.agenda.model.Aluno;
import com.brq.agenda.model.Telefone;

import static com.brq.agenda.databaseRoom.AgendaMigrations.TODAS_MIGRATIONS;

@Database(entities = {Aluno.class, Telefone.class}, version = 6, exportSchema = false)

@TypeConverters({ConversorCalendar.class, ConversorTipo.class})
public abstract class AgendaDatabase extends RoomDatabase {

    private static final String NOME_BANCO_DE_DADOS = "agenda.db";
    public abstract AlunoDAO getRoomAlunoDAO();
    public abstract TelefoneDAO getTelefoneDAO();

    public static AgendaDatabase getInstance(Context context) {
        return Room.databaseBuilder(context, AgendaDatabase.class, NOME_BANCO_DE_DADOS)
                .addMigrations(TODAS_MIGRATIONS)
                .build();
    }
}
