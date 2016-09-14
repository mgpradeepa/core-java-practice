package in.mgp.atm.test;

import in.mgp.atm.factory.Factory;
import in.mgp.atm.factory.StatementFactory;
import in.mgp.atm.service.StatementType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTestClient {
	public static void main(String[] args) {
		System.out.println("Enter your selection");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		String statementType = null;

		try {
			statementType = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Factory factory = StatementFactory.getInstance();
		StatementType type = factory.createStatements(statementType);
		type.print();
	}
}
