package com.yugandhar.mdm.extern.dobj;
/* Generated Oct 2, 2017 1:29:12 PM by Hibernate Tools 5.2.1.Final using Yugandhar custom templates. 
Generated and to be used in accordance with Yugandhar common license. */

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import com.yugandhar.mdm.abstractdobj.AbstractAuthUserRoleAssocDO;

/**
 * DO class for mapped to database AUTH_USER_ROLE_ASSOC entity
*@author Yugandhar
*@version 1.0
*@since 1.0
*@see AbstractAuthUserRoleAssocDO
*/

@Entity
@Table(name = "AUTH_USER_ROLE_ASSOC", uniqueConstraints = @UniqueConstraint(columnNames = { "AUTH_USER_REGISTRY_IDPK",
		"AUTH_ROLES_REGISTRY_IDPK" }))
public class AuthUserRoleAssocDO extends AbstractAuthUserRoleAssocDO {

	/**
	 *  Any additional attributes in the OOTB entity needs to be added in this class
	 */
	private static final long serialVersionUID = 1L;

	public AuthUserRoleAssocDO() {
		super();
	}

	public AuthUserRoleAssocDO(AuthUserRoleAssocDO theAuthUserRoleAssocDO) {
		super(theAuthUserRoleAssocDO);
	}
}
