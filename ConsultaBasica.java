package br.com.fiap.estoque;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import br.com.fiap.estoque.EstoqueBasicoStub.Soma;
import br.com.fiap.estoque.EstoqueBasicoStub.SomaResponse;

public class ConsultaBasica {
	public static void main(String[] args) {
		try {
			EstoqueBasicoStub ebs = new EstoqueBasicoStub();	
			Soma sm = new Soma();
			sm.setNr1(100);
			sm.setNr2(23);
			
			SomaResponse smr = ebs.soma(sm);
			System.out.println("O resultado da opreação é : " + smr.get_return());
		}catch(AxisFault e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
	}
}
