package com.yugandhar.mdm.corecomponent;
/* Generated Jul 5, 2017 3:05:23 PM by Hibernate Tools 5.2.1.Final using Yugandhar custom templates. 
Generated and to be used in accordance with Yugandhar common license. */

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.yugandhar.mdm.extern.dobj.LeVehicleAssocDO;

public interface LeVehicleAssocRepository extends JpaRepository<LeVehicleAssocDO, Long> {
	/*
	//Get All records by some id
	@Query("select dobj from LeVehicleAssocDO dobj where <SomeId>= ?1")
	List<LeVehicleAssocDO> findAllBy<SomeId>(String <SomeId>);
	
	//Get All ACTIVE records by some id
	@Query("select dobj from LeVehicleAssocDO dobj where  <SomeId>= ?1 and (dobj.deletedTs is null or dobj.deletedTs > CURRENT_TIMESTAMP)")
	List<LeVehicleAssocDO> findAllActiveBy<SomeId>(String <SomeId>);
	
	//Get All INACTIVE records by some id
	@Query("select dobj from LeVehicleAssocDO dobj where  <SomeId>= ?1 and  dobj.deletedTs < CURRENT_TIMESTAMP")
	List<LeVehicleAssocDO> findAllInActiveBy<SomeId>(String <SomeId>);
	*/
}