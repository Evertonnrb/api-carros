package br.com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dao.CarroDao;
import br.com.domain.Carro;

@Component
public class CarroService {

	//private CarroDao db = new CarroDao();
	@Autowired
	CarroService db;	
	
	// Lista os carros do banco
	public List<Carro> getCarros() {
		List<Carro> carros = db.getCarros();
		return carros;
	}
	
	//busca um carro pelo id
	public Carro getCarro(Long id) {
		return db.getCarro(id);
	}
	
	//deleta um carro pelo id
	public boolean delete(Long id) throws SQLException {
		return db.delete(id);
	}
	
	//Salva um carro
	public boolean save (Carro carro) {
		db.save(carro);
		return true;
	}
	
	//buca pelo nome
	public List<Carro> findByName(String nome){
		return db.findByName(nome);
	}
	
	
	public List<Carro> findByType(String tipo) throws SQLException{
		return db.findByType(tipo);
	}
	
}




























