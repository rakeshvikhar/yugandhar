package com.yugandhar.mdm.composite.service;
/* Generated Jul 3, 2017 2:32:54 PM by Hibernate Tools 5.2.1.Final using Yugandhar custom templates. 
Generated and to be used in accordance with Yugandhar common license. */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yugandhar.common.constant.yugandharConstants;
import com.yugandhar.common.exception.YugandharCommonException;
import com.yugandhar.common.extern.transferobj.TxnPayload;
import com.yugandhar.common.transobj.TxnTransferObj;
import com.yugandhar.common.util.CommonValidationUtil;
import com.yugandhar.mdm.corecomponent.LePhoneAssocComponent;
import com.yugandhar.mdm.corecomponent.LegalentityComponent;
import com.yugandhar.mdm.corecomponent.PhoneStandardizedComponent;
import com.yugandhar.mdm.extern.dobj.LePhoneAssocDO;
import com.yugandhar.mdm.extern.dobj.PhoneStandardizedDO;


@Scope(value = "prototype")
@Service("com.yugandhar.mdm.composite.service.RetrieveLePhoneByLePhoneAssocIdService")
public class RetrieveLePhoneByLePhoneAssocIdService {

	private static final Logger logger = LoggerFactory.getLogger(yugandharConstants.YUGANDHAR_COMMON_LOGGER);
	
	TxnTransferObj txnTransferObjResponse;
	TxnTransferObj respTxnTransferObj;
	TxnPayload respTxnPayload;
	LePhoneAssocDO respLePhoneAssocDO;
	TxnTransferObj transitTxnTransferObj;
	TxnPayload transitTxnPayload;
	
		@Autowired
		CommonValidationUtil commonValidationUtil;
		
		@Autowired
		PhoneStandardizedComponent phoneStandardizedComponent;
		
		@Autowired
		LePhoneAssocComponent lePhoneAssocComponent;
		
		@Autowired
		LegalentityComponent legalentityComponent;
		
		public RetrieveLePhoneByLePhoneAssocIdService() {
			txnTransferObjResponse = new TxnTransferObj();
			respLePhoneAssocDO = new LePhoneAssocDO();
			respTxnTransferObj = new TxnTransferObj();
			respTxnPayload = new TxnPayload();
			transitTxnTransferObj=new TxnTransferObj();
		}
	
		@Transactional
		public TxnTransferObj process(TxnTransferObj txnTransferObj) throws YugandharCommonException {
			TxnTransferObj transitTxnTransferObj=new TxnTransferObj();
			TxnPayload transitTxnPayload = null;
			respTxnTransferObj.setTxnHeader(txnTransferObj.getTxnHeader());
			transitTxnTransferObj.setTxnHeader(txnTransferObj.getTxnHeader());
			
			try {
				
				LePhoneAssocDO reqLePhoneAssocDO= txnTransferObj.getTxnPayload().getLePhoneAssocDO();
				
				// Process Phone Association
				transitTxnPayload= new TxnPayload();
				transitTxnPayload.setLePhoneAssocDO(reqLePhoneAssocDO);
				transitTxnTransferObj.setTxnPayload(transitTxnPayload);
				transitTxnTransferObj = lePhoneAssocComponent.findById(transitTxnTransferObj);
				respLePhoneAssocDO = transitTxnTransferObj.getTxnPayload().getLePhoneAssocDO();
				
				
				// process PhoneStandardizedDO if present
				if (!(null == respLePhoneAssocDO.getPhoneStandardizedIdpk() || respLePhoneAssocDO.getPhoneStandardizedIdpk().isEmpty())) {
					
						transitTxnPayload= new TxnPayload();
						PhoneStandardizedDO phoneStandardizedDO = new PhoneStandardizedDO();
						phoneStandardizedDO.setIdPk(respLePhoneAssocDO.getPhoneStandardizedIdpk());
						
						transitTxnPayload.setPhoneStandardizedDO(phoneStandardizedDO);
						transitTxnTransferObj.setTxnPayload(transitTxnPayload);
						transitTxnTransferObj = phoneStandardizedComponent.findById(transitTxnTransferObj);
						//set the FK PhoneStandardizedIdpk and the PhoneStandardizedDO object
						respLePhoneAssocDO.setPhoneStandardizedDO(transitTxnTransferObj.getTxnPayload().getPhoneStandardizedDO());
					
					
				}
			
				
				
				
				//Final Response object
				respTxnPayload.setLePhoneAssocDO(respLePhoneAssocDO);
				respTxnTransferObj.setTxnPayload(respTxnPayload);
				
				
			} catch (YugandharCommonException yce) {
				logger.error("Composite Service failed", yce);
				throw yce;
			} catch (Exception e) {
				//write the logic to get error message based on error code. Error code is hard-coded here
				logger.error("Composite Service failed", e);
				e.printStackTrace();
				throw commonValidationUtil.populateErrorResponse(txnTransferObj, "5", e,
						"CreateLePhoneService failed unexpectedly");

			}
			respTxnTransferObj.setResponseCode(yugandharConstants.RESPONSE_CODE_SUCCESS);
			return respTxnTransferObj;

		}

		

		
}
