package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNg extends Base
{
    @Test(dataProvider="Rdata")
	public void Rol(String Rn,String Rt) throws InterruptedException
	{
		Lb.Role(Rn,Rt);
	}
    
    @DataProvider
    
    public Object [][] Rdata()
    {
    	Object[][] obj=new Object[3][2];
    	
    	obj[0][0]="CashierSCB";
        obj[0][1]="E";
    	
        obj[1][0]="ManagerSCB";
        obj[1][1]="E";
    	
        obj[2][0]="Gmanager";
        obj[2][1]="E";
        
        return obj;
        
       }
    
}
