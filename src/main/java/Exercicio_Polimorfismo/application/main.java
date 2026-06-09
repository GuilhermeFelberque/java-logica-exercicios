package Exercicio_Polimorfismo.application;

import Exercicio_Polimorfismo.entities.Account;
import Exercicio_Polimorfismo.entities.BusinessAccount;
import Exercicio_Polimorfismo.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class main {
        public static void main(String[] args) {

            List<Account> list = new ArrayList<>();
            list.add(new SavingsAccount(1024,"João", 500.00, 2.0));
            list.add(new SavingsAccount(1025,"tião", 500.00, 2.0));
            list.add(new BusinessAccount(1026,"Melão", 500.00, 2.0));
            list.add(new BusinessAccount(1027,"Jão", 500.00, 2.0));

            double sum = 0.0;
            for(Account biscoito : list){
                sum += biscoito.getBalance();
            }
            System.out.printf("Total de todas as contas: %.2f%n", sum);

            for(Account acc : list){
                acc.deposit(10.0);
            }
            for(Account acc : list){
                System.out.println("Valor do saldo atualizado - Number: " + acc.getNumber() +", Balance: " +acc.getBalance());
            }
        }
    }