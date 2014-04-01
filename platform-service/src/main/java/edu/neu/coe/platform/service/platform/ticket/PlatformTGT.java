/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.coe.platform.service.platform.ticket;

import edu.neu.coe.platform.service.util.ConstantUtil;



/**
 *
 * @author Cynthia
 */
public class PlatformTGT extends TGT{
    
    public PlatformTGT(String sessionid,String platformname){
        super(sessionid);
        super.authenticator=platformname;
        super.expiredTime=System.currentTimeMillis()+ConstantUtil.PLATFORM_TICKET_ACTIVE_TIME;
        
    }
    
}
