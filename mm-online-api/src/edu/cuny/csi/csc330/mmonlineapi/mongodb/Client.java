package edu.cuny.csi.csc330.mmonlineapi.mongodb;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;

public class Client {
	
	// The morphia instance.
	private Morphia morphia;
	
	// The client we will use to connect to the datastore.
	private MongoClient client;
	
	private MongoClientURI uri;
	
	// The datastore we are connecting to.
	private Datastore datastore;
	
	public Client () {
		
		// Instantiate morphia.
		morphia =  new Morphia();
		
		// Create mapping to classes to be modeled.
		morphia.mapPackage("edu.cuny.csi.csc330.mmonlineapi.models");
		
		uri = new MongoClientURI("mongodb://mmo-register:q1UdNrt2C0qH@ds064748.mlab.com:64748/tomcotest-east");
		
		// Create db client.
		client = new MongoClient(uri);
		
		// Create connection to db client.
		datastore = morphia.createDatastore(client, "tomcotest-east");
		datastore.ensureIndexes();
	}

	public Datastore getDatastore() {
		return datastore;
	}
	
}
