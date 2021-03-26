package com.brq.agenda.databaseRoom.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.brq.agenda.model.Telefone;

@Dao
public interface TelefoneDAO {

    @Query("SELECT t.* FROM Telefone t JOIN Aluno a ON t.alunoId = a.id WHERE t.alunoId = :alunoId LIMIT 1")
    Telefone buscaPrimeiroTelefoneDoAluno(int alunoId);

}
