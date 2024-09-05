package model.dao;

import model.db.DB;

public class FactoryDAO {

	public static CursoDAO createCursoDAO() {
		return new CursoDAOImp(DB.getConexao());
	}
}
