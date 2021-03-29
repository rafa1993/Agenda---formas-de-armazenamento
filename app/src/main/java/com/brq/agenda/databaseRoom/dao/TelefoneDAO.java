package com.brq.agenda.databaseRoom.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.brq.agenda.model.Telefone;

import java.util.List;

@Dao
public interface TelefoneDAO {

    @Query("SELECT * FROM Telefone WHERE alunoId = :alunoId LIMIT 1")
    Telefone buscaPrimeiroTelefoneDoAluno(int alunoId);

    @Insert
    void salva(Telefone... telefones);

    @Query("SELECT * FROM Telefone WHERE alunoId = :alunoId")
    List<Telefone> buscaTodosTelefoneAluno(int alunoId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void atualiza(Telefone... telefones);

}
