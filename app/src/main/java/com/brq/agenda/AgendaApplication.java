package com.brq.agenda;

import android.app.Application;

import com.brq.agenda.dao.AlunoDAO;
import com.brq.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Rafaela", "11974853420", "rafaelahmorais@hotmail.com"));
        dao.salva(new Aluno("Alex", "11974853420", "alex@hotmail.com"));
    }
}
