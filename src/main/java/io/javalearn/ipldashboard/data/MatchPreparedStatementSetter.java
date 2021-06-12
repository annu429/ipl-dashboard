package io.javalearn.ipldashboard.data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import io.javalearn.ipldashboard.model.Match;

final class MatchPreparedStatementSetter implements ItemPreparedStatementSetter<Match> {

    @Override
    public void setValues(Match match, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setLong(1, match.getId());
        preparedStatement.setString(2, match.getCity());
        preparedStatement.setObject(3, match.getDate());
        preparedStatement.setString(4, match.getPlayerOfMatch());
        preparedStatement.setString(5, match.getVenue());
        preparedStatement.setString(6, match.getTeam1());
        preparedStatement.setString(7, match.getTeam2());
        preparedStatement.setString(8, match.getTossWinner());
        preparedStatement.setString(9, match.getTossDecision());
        preparedStatement.setString(10, match.getMatchWinner());
        preparedStatement.setString(11, match.getResult());
        preparedStatement.setString(12, match.getResultMargin());
        preparedStatement.setString(13, match.getUmpire1());
        preparedStatement.setString(14, match.getUmpire2());
    }
}
