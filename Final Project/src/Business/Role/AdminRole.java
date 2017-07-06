/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface_HospitalAdminRole.AdminWorkAreaHospitalJPanel;
import UserInterface_PathologyLabAdminRole.AdminWorkAreaPathologyLabJPanel;
import UserInterface_PharmacyAdminRole.AdminWorkAreaPharmacyJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Tanisha_Jain
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,
            Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        
        for(Organization.OrganizationType type : Organization.OrganizationType.values())
        {
            if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital)
            {
                return new AdminWorkAreaHospitalJPanel(userProcessContainer, enterprise);
            }

            else if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Pharmacy)
           {
            return new AdminWorkAreaPharmacyJPanel(userProcessContainer, enterprise);
           }
        
             else if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.PathologyLab)
           {
            return new AdminWorkAreaPathologyLabJPanel(userProcessContainer, enterprise);
           }
        
        }
        
    return null;
   
    }

    @Override
    public String toString(){
    return RoleType.Admin.getValue();
    }
    
    
}
