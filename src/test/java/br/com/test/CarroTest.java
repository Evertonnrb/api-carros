package br.com.test;

import br.com.service.CarroService;
import br.com.util.SpringUtil;
import junit.framework.TestCase;

public class CarroTest extends TestCase {
	
	private CarroService carroService;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		carroService = (CarroService) SpringUtil.getInstance().getBean(CarroService.class);
	}
	
	
}
