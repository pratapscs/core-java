package com.frameworks;

public class Hibernate {

	/* 1.Benefits and risks of using Hibernate?
	 * 
	 * 
	 *  2.What is a SessionFactory? Is it a thread-safe object?
	 *  The main contract here is the creation of Session instances. Usually an application has a single 
	 *  SessionFactory instance and threads servicing client requests obtain Session instances from this 
	 *  factory.The internal state of a SessionFactory is immutable. Once it is created this internal state 
	 *  is set. This internal state includes all of the metadata about Object/Relational Mapping.
	 *  Implementors must be threadsafe.
	 *  
	 *  --------------------------------------------------------
	 *  3.What is the difference between merge and update
	 *  
	 *  saveOrUpdate: Calls either save or update depending on some checks. E.g. if no identifier
	 *  exists, save is called. Otherwise update is called.
	 *  
	 *  save:Persists an entity. Will assign an identifier if one doesn't exist. If one does, it's 
	 *  essentially doing an update. Returns the generated ID of the entity.
	 *  
	 *  update:Update the persistent instance with the identifier of the given detached instance. 
	 *  If there is a persistent instance with the same identifier,an exception is thrown. 
	 *  This operation cascades to associated instances if the association is mapped with 
	 *  cascade="save-update".
	 *  
	 *  merge: Copy the state of the given object onto the persistent object with the same identifier. 
	 *  If there is no persistent instance currently associated with the session, it will be loaded.
	 *  Return the persistent instance. If the given instance is unsaved, save a copy of and return it as
	 *  a newly persistent instance. The given instance does not become associated with the session. 
	 *  This operation cascades to associated instances if the association is mapped with cascade="merge".
	 *  In these cases you need to use merge for updates and persist for saving.
	 *  
	 *  persist:As mentioned above, this is used on transient objects. It does not return the generated ID.
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 * 
	 *  
	 *  

	 */
}
