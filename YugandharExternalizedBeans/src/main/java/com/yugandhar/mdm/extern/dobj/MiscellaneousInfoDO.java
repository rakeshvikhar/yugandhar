package com.yugandhar.mdm.extern.dobj;
/* Generated Sep 4, 2017 4:22:12 PM by Hibernate Tools 5.2.1.Final using Yugandhar custom templates. 
Generated and to be used in accordance with Yugandhar common license. */

import javax.persistence.Entity;
import javax.persistence.Table;

import com.yugandhar.mdm.abstractdobj.AbstractMiscellaneousInfoDO;

/**
 * DO class for mapped to database MISCELLANEOUS_INFO entity
*@author Yugandhar
*@version 1.0
*@since 1.0
*@see AbstractMiscellaneousInfoDO
*/

@Entity
@Table(name = "MISCELLANEOUS_INFO")
public class MiscellaneousInfoDO extends AbstractMiscellaneousInfoDO {

	/**
	 *  Any additional attributes in the OOTB entity needs to be added in this class
	 */
	private static final long serialVersionUID = 1L;

	public MiscellaneousInfoDO() {
		super();
	}

	public MiscellaneousInfoDO(MiscellaneousInfoDO theMiscellaneousInfoDO) {
		super(theMiscellaneousInfoDO);
	}
}
