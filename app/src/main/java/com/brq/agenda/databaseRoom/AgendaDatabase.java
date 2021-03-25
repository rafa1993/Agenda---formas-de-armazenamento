package com.brq.agenda.databaseRoom;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.brq.agenda.databaseRoom.dao.AlunoDAO;
import com.brq.agenda.model.Aluno;

@Database(entities = {Aluno.class}, version = 2, exportSchema = false)
public abstract class AgendaDatabase extends RoomDatabase {

    private static final String NOME_BANCO_DE_DADOS = "agenda.db";

    public abstract AlunoDAO getRoomAlunoDAO();

    public static AgendaDatabase getInstance(Context context){
        return Room.databaseBuilder(context, AgendaDatabase.class, NOME_BANCO_DE_DADOS)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }
}
