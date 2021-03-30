package com.brq.agenda.asynctask;

import android.os.AsyncTask;

import com.brq.agenda.databaseRoom.dao.TelefoneDAO;
import com.brq.agenda.model.Aluno;
import com.brq.agenda.model.Telefone;

import java.util.List;

public class BuscaTodosTelefonesDoAlunoTask extends AsyncTask<Void, Void, List<Telefone>> {

    private final TelefoneDAO telefoneDAO;
    private final Aluno aluno;
    private final TelefonesDoAlunoEncontradoListener listener;

    public BuscaTodosTelefonesDoAlunoTask(TelefoneDAO telefoneDAO, Aluno aluno, TelefonesDoAlunoEncontradoListener listener) {
        this.telefoneDAO = telefoneDAO;
        this.aluno = aluno;
        this.listener = listener;
    }

    @Override
    protected List<Telefone> doInBackground(Void... voids) {
        return telefoneDAO.buscaTodosTelefoneAluno(aluno.getId());
    }

    @Override
    protected void onPostExecute(List<Telefone> telefones) {
        super.onPostExecute(telefones);
        listener.quandoEncontrados(telefones);
    }

    public interface TelefonesDoAlunoEncontradoListener{
        void quandoEncontrados(List<Telefone> telefones);
    }

}
