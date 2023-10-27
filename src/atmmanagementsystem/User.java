/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmanagementsystem;

/**
 *
 * @author HP
 */
class User {
    private int accountno;
    private String ttype;
    private int tamount;
    private String tdate;
    
    public User(int accountno, String ttype, int tamount, String tdate){
        this.accountno = accountno;
        this.ttype = ttype;
        this.tamount = tamount;
        this.tdate= tdate;
    }
    public int getaccountno(){
        return accountno;
    }
    public String getttype(){
        return ttype;
    }
    public int gettamount(){
        return tamount;
    }
    public String gettdate(){
        return tdate;
    }
}
