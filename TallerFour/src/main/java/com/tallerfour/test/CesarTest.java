package com.tallerfour.test;

import org.junit.Assert;
import org.junit.Test;


import logic.Cesar;

public class CesarTest {
	
	@Test
	public void criptacionTest(){
		
		String entrada= "WIKIPEDIA wikipedia";
		String encriptar=Cesar.cesar(entrada, 0, 3);
		String desencriptar=Cesar.cesar(encriptar, 1, 3);
		
		Assert.assertEquals(entrada, desencriptar);
	}
}
