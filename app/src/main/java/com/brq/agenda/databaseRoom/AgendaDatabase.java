package com.brq.agenda.databaseRoom;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.brq.agenda.databaseRoom.dao.RoomAlunoDAO;
import com.brq.agenda.model.Aluno;

@Database(entities = {Aluno.class}, version = 1, exportSchema = false)
public abstract class AgendaDatabase extends RoomDatabase {

    public abstract RoomAlunoDAO getRoomAlunoDAO();
}
