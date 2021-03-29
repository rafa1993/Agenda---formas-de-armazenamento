package com.brq.agenda.asynctask;

import android.os.AsyncTask;

import com.brq.agenda.databaseRoom.dao.AlunoDAO;
import com.brq.agenda.ui.adapter.ListaAlunosAdapter;

public class BuscaAlunosTask extends AsyncTask {

    private final AlunoDAO dao;
    private final ListaAlunosAdapter adapter;

    public BuscaAlunosTask(AlunoDAO dao, ListaAlunosAdapter adapter) {
        this.dao = dao;
        this.adapter = adapter;
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        adapter.atualiza(dao.todos());
        return null;
    }
}
