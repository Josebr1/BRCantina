package br.com.cruzeiro.ads.brcantina.dao;

import br.com.cruzeiro.ads.brcantina.dao.interfaces.IContaReceberDAO;
import br.com.cruzeiro.ads.brcantina.models.ContaReceber;
import br.com.cruzeiro.ads.brcantina.models.FormasPagamento;
import br.com.cruzeiro.ads.brcantina.utils.DBUtils;
import br.com.cruzeiro.ads.brcantina.utils.DataUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaReceberDAO implements IContaReceberDAO {

    private Connection mConnection = null;

    @Override
    public void insert(ContaReceber model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();

        try {
            String sql = "INSERT INTO conta_receber (tipo_conta, valor, data_credito, observacao, fk_foma_pagamento) VALUES (?, ?, ?, ?, ?);";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setString(1, model.getTipoConta());
            statement.setDouble(2, model.getValor());
            statement.setString(3, DataUtils.convertSql(model.getDataCredito()));
            statement.setString(4, model.getObservacao());
            statement.setInt(5, model.getFormaPagamento().getIdFormaPagamento());

            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void update(ContaReceber model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

    }

    @Override
    public List<ContaReceber> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        List<ContaReceber> all = new ArrayList<>();
        ResultSet resultSet;

        try {
            String sql = "SELECT * FROM conta_receber INNER JOIN foma_pagamento ON conta_receber.FK_FOMA_PAGAMENTO = foma_pagamento.ID_FOMA_PAGAMENTO";

            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()){
                all.add(new ContaReceber(
                        resultSet.getInt("ID_CONTA_RECEBER"),
                        resultSet.getString("TIPO_CONTA"),
                        resultSet.getDouble("VALOR"),
                        resultSet.getDate("DATA_CREDITO"),
                        resultSet.getString("OBSERVACAO"),
                        new FormasPagamento(resultSet.getInt("ID_FOMA_PAGAMENTO"), resultSet.getString("DESCRICAO")))
                );
            }
            return all;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
}
