/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg004TIbanco;

import javax.swing.JOptionPane;

/**
 *
 * @author @emayaml
 */
public class MainMenuBanco {

    //USO DE VARIABLES ESTATICAS 
    static String name;
    static int num;
    static int balance;
    static String typec;
    static String status;
    static int b;
    
    
    static StackPila pil = new StackPila();
    static StackPila aux = new StackPila();

    public static void main(String[] args) {
        String menuBank[] = {"Add", "Request", "Modify account", "Show", "Savings balance", "balance check", "Exit"};
        BankAccount cb = new BankAccount(num, name, balance, typec);
        String name, opt;

        do {
            opt = (String) JOptionPane.showInputDialog(null,
                    "Selected option",
                    "Main menu",
                    2,
                    null,
                    menuBank,
                    menuBank[2]);
            switch (opt) {

                case "Add":
                    add(pil);
                    break;
                case "Request":
                    Request(pil, aux);
                    break;

                case "Modify account":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the account number:"));
                    while (!pil.isEmpty()) {
                        cb = (BankAccount) pil.Pop();
                        if ((int) cb.getNumberAccount() == id) {
                            b = Integer.parseInt(JOptionPane.showInputDialog("Enter the new balance"));
                            cb.setBalance(b);
                            aux.Push(cb);
                            JOptionPane.showMessageDialog(null, "The balance has been updated");
                        } else {
                            aux.Push(pil);
                        }
                    }
                    while (!aux.isEmpty()) {
                        pil.Push(aux.Pop());
                    }
                    break;

                case "Show":
                    show(pil, aux);
                    break;

                case "Savings balance":
                    JOptionPane.showMessageDialog(null, "See savings accounts");
                    ShowSa(pil, aux);
                    break;

                case "Balance check":
                    JOptionPane.showMessageDialog(null, "See checking accounts");
                    ShowCheck(pil, aux);

                    break;

                case "total Value":
                    break;

                case "Consult":
                    while (!pil.isEmpty()) {
                        pil.Pop();
                    }
                    String menuBank2[] = {"Property", "Deposit", "Withdraw", "exit"};
                    String opt2;
                    do {
                        opt2 = (String) JOptionPane.showInputDialog(null, "Selected option", "Menu 2", 1, null, menuBank2, menuBank2[0]);

                        switch (opt2) {
                            case "Property":
                                // añadir(Pila);
                                break;
                            case "Deposit":
                                //añadir(q);
                                break;
                            case "Withdraw":
                                //mostrar(pilp, aux, "p");
                                break;

                        }
                    } while (!opt2.equals("Exit"));

            }

        } while (!opt.equals("Exit"));
    }

    public static void show(StackPila pilp, StackPila aux) {
        String cadena = "";
        BankAccount g = null;

        while (!pilp.isEmpty()) {
            g = (BankAccount) pilp.Pop();
            cadena += g + "\n";
            aux.Push(g);
        }
        while (!aux.isEmpty()) {
            pilp.Push(aux.Pop());
        }
        JOptionPane.showMessageDialog(null, "\n" + cadena);

    }

    public static String ShowSa(StackPila pilp, StackPila aux) {
        String c = "";
        BankAccount j = null;

        while (!pilp.isEmpty()) {
            j = (BankAccount) pilp.Pop();
            c += j + "\n";
            aux.Push(j);
        }
        while (!aux.isEmpty()) {
            pilp.Push(aux.Pop());
        }
        JOptionPane.showMessageDialog(null, "Sanvings accounts");

        JOptionPane.showMessageDialog(null, "\n" + c);
        return c;
    }

    public static String ShowCheck(StackPila pilp, StackPila aux) {
        String check = "";
        BankAccount v = null;

        while (!pilp.isEmpty()) {
            v = (BankAccount) pilp.Pop();
            check += v + "\n";
            aux.Push(v);
        }
        while (!aux.isEmpty()) {
            pilp.Push(aux.Pop());
        }
        JOptionPane.showMessageDialog(null, "Chek accounts");
        JOptionPane.showMessageDialog(null, "\n" + check);
        return check;
    }

    public static void add(StackPila pilp) {

        typec = JOptionPane.showInputDialog("Type of account to register");
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter the account number"));
        name = JOptionPane.showInputDialog("Enter the name");
        balance = Integer.parseInt(JOptionPane.showInputDialog("Enter account balance"));
        BankAccount g = new BankAccount(num, name, balance, typec);
        pilp.Push(g);

    }

    public static void Request(StackPila pilp, StackPila aux) {
        boolean status = false;
        int yearsP = Integer.parseInt(JOptionPane.showInputDialog("how old are you?"));
        if (yearsP >= 18) {
            status = true;
        } else {
            status = false;
        }
        if (status == true) {
            JOptionPane.showMessageDialog(null, "Your account has been approved");
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter the account number you want to manage"));
            typec = JOptionPane.showInputDialog("Enter the type of account you want to manage");
            name = JOptionPane.showInputDialog("Enter the name");
            balance = Integer.parseInt(JOptionPane.showInputDialog("Enter account balance"));
            BankAccount sl = new BankAccount(num, name, balance, typec);
            pilp.Push(sl);
        } else {
            JOptionPane.showMessageDialog(null, "Your account has been denied");
        }
    }

    public static String ShowCh(StackPila pilp, StackPila aux) {
        double hf = 0;
        BankAccount d;
        String ad = "";
        while (!pilp.isEmpty()) {
            d = (BankAccount) pilp.Pop();
            if (d.getBalance() >= hf) {
                hf = d.getBalance();
                ad = (ShowSa(pilp, aux));
            }
            aux.Push(ad);
        }
        while (!aux.isEmpty()) {
            pilp.Push(aux.Pop());
        }
        return ad;
    }
}
