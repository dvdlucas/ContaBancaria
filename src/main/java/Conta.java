import java.io.Console;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {
	
	/**
	 * @author David Lucas
	 * @param saque
	 * @param saldo
	 * @param ClienteEspecial
	 * @throws Throwable
	 */

	@Given("^um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int saldo,boolean ClienteEspecial) throws Throwable {
		saldo = -200;
	    throw new PendingException();
	}

	@When("^for solicitado um saque no valor de (\\d+) reais$")
	public void for_solicitado_um_saque_no_valor_de_reais(int saque,boolean ClienteEspecial) throws Throwable {
	    if(ClienteEspecial == true) {
		saque = 100;
	    }
	    throw new PendingException();
	}

	@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int saque, int saldo,boolean ClienteEspecial) throws Throwable {
	    if(ClienteEspecial == true && saldo == -200) {
		saque = 100;
	    saldo = saldo - saque;
	    }
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes(int saldo, boolean ClienteEspecial) throws Throwable {
	    if(ClienteEspecial == true) {
		System.out.print("Saque Realizado, saldo Atualizado "+saldo);
	    }
	    throw new PendingException();
	}

	@Given("^Um cliente comum com saldo atual de -(\\d+) reais$")
	public void um_cliente_comum_com_saldo_atual_de_reais(int saldo) throws Throwable {
	    saldo = -200;
	    throw new PendingException();
	}

	@When("^solicitar um saque de (\\d+) reais$")
	public void solicitar_um_saque_de_reais(int saque) throws Throwable {
	    saque = 100;
	    throw new PendingException();
	}

	@Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente(int saque, int saldo, boolean ClienteEspecial) throws Throwable {
	    if(ClienteEspecial == false) {
		saque = 0;
	    saldo = -200;
	    System.out.print("Saldo Insuficiente para Realizar essa operação");
	    }
	    throw new PendingException();
	}

}
