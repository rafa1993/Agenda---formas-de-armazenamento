package com.brq.agenda.asynctask;

import android.os.AsyncTask;

import com.brq.agenda.databaseRoom.dao.AlunoDAO;
import com.brq.agenda.model.Aluno;
import com.brq.agenda.ui.adapter.ListaAlunosAdapter;

import java.util.List;

public class BuscaAlunosTask extends AsyncTask<Void, Void, List<Aluno>> {

    private final AlunoDAO dao;
    private final ListaAlunosAdapter adapter;

    public BuscaAlunosTask(AlunoDAO dao, ListaAlunosAdapter adapter) {
        this.dao = dao;
        this.adapter = adapter;
    }

    @Override
    protected List<Aluno> doInBackground(Void[] objects) {
        return dao.todos();
    }

    @Override
    protected void onPostExecute(List<Aluno> todosAlunos) {
        super.onPostExecute(todosAlunos);
        adapter.atualiza(todosAlunos);
    }
}
