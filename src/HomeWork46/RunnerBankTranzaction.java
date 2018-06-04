package HomeWork46;

import java.util.*;


public class RunnerBankTranzaction {
    public static void main(String[] args) {
        BankTransaction keyUsers = new BankTransaction("yura", "bahlay");
        BankTransaction keyUsers1 = new BankTransaction("tolik", "Snegerjov");
        BankTransaction keyUsers2 = new BankTransaction("nastja", "fedorcyk");
        BankTransaction keyUsers3 = new BankTransaction("shawa", "balina");
        BankTransaction keyUsers4 = new BankTransaction("wana", "arkadiivna");
        BankTransaction keyUsers5 = new BankTransaction("bodja", "fedunj");
        BankTransaction keyUsers6 = new BankTransaction("orusja", "pit");


        BankTransaction transactionUsers = new BankTransaction("Trylovskoho", "1231231231", 4000);
        BankTransaction transactionUsers1 = new BankTransaction("Antonuca", "5457082344", 10500);
        BankTransaction transactionUsers2 = new BankTransaction("volova", "91546797843", 9400);
        BankTransaction transactionUsers3 = new BankTransaction("gnatyka", "43242342423", 75000);
        BankTransaction transactionUsers4 = new BankTransaction("Patona", "423423423415", 6000);
        BankTransaction transactionUsers5 = new BankTransaction("wovkivsjka", "112211211", 3500);
        BankTransaction transactionUsers6 = new BankTransaction("powarna", "99999999999", 3000);
        transactionUsers.setTransaction();
        transactionUsers1.setTransaction();
        transactionUsers2.setTransaction();
        transactionUsers3.setTransaction();
        transactionUsers4.setTransaction();
        transactionUsers5.setTransaction();
        transactionUsers6.setTransaction();

        Map<BankTransaction, BankTransaction> tranzactionBanck = new HashMap<>();
        tranzactionBanck.put(keyUsers, transactionUsers);
        tranzactionBanck.put(keyUsers1, transactionUsers1);
        tranzactionBanck.put(keyUsers2, transactionUsers2);
        tranzactionBanck.put(keyUsers3, transactionUsers3);
        tranzactionBanck.put(keyUsers4, transactionUsers4);
        tranzactionBanck.put(keyUsers5, transactionUsers5);
        tranzactionBanck.put(keyUsers6, transactionUsers6);
        //tranzactionBanck.put(keyUsers2, transactionUsers);


        //System.out.println("Size: " + tranzactionBanck.size());
        //System.out.println("Hash Cod: " + tranzactionBanck.hashCode());
        //System.out.println("IsEmpty: " + tranzactionBanck.isEmpty());
        //BankTransaction keyUsers8 = new BankTransaction("yura1", "bahlay1");
        //System.out.println("ContainsKey: " + tranzactionBanck.containsKey(keyUsers8));
        //BankTransaction transactionUsers9 = new BankTransaction("powarna", "99999999999", 3000);
        //transactionUsers9.setTransaction();
        //System.out.println("Contains Value: "+ tranzactionBanck.containsValue(transactionUsers6));
        //Map<BankTransaction,BankTransaction> rrrr = new HashMap<>();
        //System.out.println("Equals: " + tranzactionBanck.equals(tranzactionBanck));
        //System.out.println("Equals: " + tranzactionBanck.equals(rrrr));
        //BankTransaction ob5 = tranzactionBanck.get(keyUsers6);
        //System.out.println("GetKey: " + ob5);

        //Set<BankTransaction> ob10 = tranzactionBanck.keySet();
        //System.out.println("KeySet" + ob10.toString());
        //System.out.println("" + tranzactionBanck.getOrDefault(keyUsers,transactionUsers9));
        //BankTransaction re = tranzactionBanck.remove(keyUsers);
        //System.out.println("Reove: " + re);
        //Collection<BankTransaction> ob1 = tranzactionBanck.values();
        //System.out.println(" ");
        //Iterator<BankTransaction> it = ob1.iterator();
        //while (it.hasNext()) {
        //System.out.println(it.next());
        //}
        //BankTransaction ob11 = tranzactionBanck.remove(keyUsers);
        //System.out.println("BT" + ob11);


        //Set<Map.Entry<BankTransaction, BankTransaction>> ob = tranzactionBanck.entrySet();
        for (Map.Entry<BankTransaction, BankTransaction> item : tranzactionBanck.entrySet()) {
            BankTransaction key = item.getKey();
            BankTransaction value = item.getValue();
            key.showKey();
            value.showTranzaction();
            System.out.println(" ");
        }
    }
}
